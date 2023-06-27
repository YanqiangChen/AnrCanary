package com.anr.anrcanary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.matrix.Matrix;
import com.tencent.matrix.trace.config.TraceConfig;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//import com.tencent.matrix_trace_canary.NativeLib;

public class MainActivity extends AppCompatActivity {
    private TextView tvShowNative;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShowNative = findViewById(R.id.tv_native);
        handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Toast.makeText(MainActivity.this,"MainActivity",Toast.LENGTH_SHORT).show();
//                handler.postDelayed(this,1000);
//
//            }
//        },1000);
        findViewById(R.id.btn_anr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),
//                        "连续点击两次产生Input ANR",
//                        Toast.LENGTH_LONG).show();
//
//                try {
//                    Thread.sleep(10 * 1000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                Toast.makeText(getApplicationContext(),
//                        "Sleep end",
//                        Toast.LENGTH_SHORT).show();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String content = "";
                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                            content = readSaveFile(getDataDir().getPath()+"/anrtest.txt");
                            saveToFile(content,getDataDir().getPath(),"anrtest123.txt");
                        }
                        handler.postDelayed(this,1000);

                    }
                },1000);

            }
        });



    }
    private String readSaveFile(String filename) {
        FileInputStream inputStream;

        try {
            File file = new File(filename);
            inputStream = new FileInputStream(file);
//            inputStream = openFileInput(filename);
            byte temp[] = new byte[1024];
            StringBuilder sb = new StringBuilder("");
            int len = 0;
            while ((len = inputStream.read(temp)) > 0){
                sb.append(new String(temp, 0, len));
            }
            inputStream.close();
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public void saveToFile(String content,String filePath,String fileName) {
        BufferedWriter out = null;
        try {
            /*
            输出流的构造参数1：可以是File对象  也可以是文件路径
            输出流的构造参数2：默认为False=>覆盖内容； true=>追加内容
             */
            File dir = new File(filePath,fileName);
            if (!dir.exists()) {
                dir.createNewFile();
            } else {
                dir.delete();
                dir.createNewFile();
            }

            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath+"/"+fileName,true)));
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