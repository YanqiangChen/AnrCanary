package com.tencent.matrix_backtrace;

public class NativeLib {

    // Used to load the 'matrix_backtrace' library on application startup.
    static {
        System.loadLibrary("matrix_backtrace");
    }

    /**
     * A native method that is implemented by the 'matrix_backtrace' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}