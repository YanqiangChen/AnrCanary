package com.tencent.matrix_android_commons;

public class NativeLib {

    // Used to load the 'matrix_android_commons' library on application startup.
    static {
        System.loadLibrary("matrix_android_commons");
    }

    /**
     * A native method that is implemented by the 'matrix_android_commons' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}