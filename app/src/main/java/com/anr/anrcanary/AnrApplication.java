package com.anr.anrcanary;

import android.app.Application;
import android.os.Build;

import com.tencent.matrix.Matrix;
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
//        traceBuilder.enableHistoryMsgRecorder(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            traceBuilder.anrTracePath(this.getDataDir().getPath()+"/anrtest.txt");  // /data/user/0/com.anr.anrcanary/anr
        }
        TracePlugin tracePlugin = new TracePlugin(traceBuilder.build());
        Matrix.init(builder.plugin(tracePlugin).build());
        tracePlugin.start();

    }

}
