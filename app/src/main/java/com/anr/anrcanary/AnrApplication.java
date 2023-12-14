package com.anr.anrcanary;

import android.app.Application;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.tencent.matrix.Matrix;
import com.tencent.matrix.plugin.Plugin;
import com.tencent.matrix.plugin.PluginListener;
import com.tencent.matrix.report.Issue;
import com.tencent.matrix.trace.TracePlugin;
import com.tencent.matrix.trace.config.TraceConfig;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AnrApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Matrix.Builder builder = new Matrix.Builder(this);
        TraceConfig.Builder traceBuilder = new TraceConfig.Builder();
        traceBuilder.enableSignalAnrTrace(true);
//        traceBuilder.looperAnrTracer(true);
        traceBuilder.enableIdleHandlerTrace(true);
//        traceBuilder.enableHistoryMsgRecorder(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            traceBuilder.anrTracePath(this.getDataDir().getPath()+"/anrtest.txt");  // /data/user/0/com.anr.anrcanary/anr
        }
        TracePlugin tracePlugin = new TracePlugin(traceBuilder.build());
        builder.pluginListener(new PluginListener() {
            @Override
            public void onInit(Plugin plugin) {

            }

            @Override
            public void onStart(Plugin plugin) {

            }

            @Override
            public void onStop(Plugin plugin) {

            }

            @Override
            public void onDestroy(Plugin plugin) {

            }

            @Override
            public void onReportIssue(Issue issue) {
//                String jsonStr = JSON.toJSONString(issue);
//                saveToFile(issue.getContent().toString(),issue.getKey());


            }
        });
        Matrix.init(builder.plugin(tracePlugin).build());
        tracePlugin.start();

    }

    //保存文件到sd卡
    public void saveToFile(String content,String fileName) {
        BufferedWriter out = null;
        File file = Environment.getExternalStorageDirectory();
        try {
            /*
            输出流的构造参数1：可以是File对象  也可以是文件路径
            输出流的构造参数2：默认为False=>覆盖内容； true=>追加内容
             */
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getCacheDir().getAbsolutePath() + "/" + fileName +".txt",true)));
            out.newLine();
            out.write(content);
            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
