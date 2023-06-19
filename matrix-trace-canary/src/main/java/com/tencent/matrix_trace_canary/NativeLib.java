package com.tencent.matrix_trace_canary;

public class NativeLib {

    // Used to load the 'matrix_trace_canary' library on application startup.
    static {
        System.loadLibrary("matrix_trace_canary");
    }

    /**
     * A native method that is implemented by the 'matrix_trace_canary' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}