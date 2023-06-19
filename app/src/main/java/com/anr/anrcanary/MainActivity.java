package com.anr.anrcanary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

//import com.tencent.matrix_trace_canary.NativeLib;

public class MainActivity extends AppCompatActivity {
    private TextView tvShowNative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShowNative = findViewById(R.id.tv_native);
//        tvShowNative.setText(new NativeLib().stringFromJNI());

    }
}