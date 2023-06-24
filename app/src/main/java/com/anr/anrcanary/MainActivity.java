package com.anr.anrcanary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.matrix.Matrix;
import com.tencent.matrix.trace.config.TraceConfig;

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
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"MainActivity",Toast.LENGTH_SHORT).show();
                handler.postDelayed(this,1000);

            }
        },1000);
        findViewById(R.id.btn_anr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "连续点击两次产生Input ANR",
                        Toast.LENGTH_LONG).show();

                try {
                    Thread.sleep(10 * 1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Toast.makeText(getApplicationContext(),
                        "Sleep end",
                        Toast.LENGTH_SHORT).show();

            }
        });



    }
}