package com.anr.anrcanary;

import android.app.Application;
import android.os.Build;
import android.util.Log;

import com.tencent.matrix.Matrix;
import com.tencent.matrix.plugin.Plugin;
import com.tencent.matrix.plugin.PluginListener;
import com.tencent.matrix.report.Issue;
import com.tencent.matrix.trace.TracePlugin;
import com.tencent.matrix.trace.config.TraceConfig;

public class AnrApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Matrix.Builder builder = new Matrix.Builder(this);
        TraceConfig.Builder traceBuilder = new TraceConfig.Builder();
        traceBuilder.enableSignalAnrTrace(true);
        traceBuilder.looperAnrTracer(true);
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
                Log.e("","");

            }
        });
        Matrix.init(builder.plugin(tracePlugin).build());
        tracePlugin.start();

    }

}
