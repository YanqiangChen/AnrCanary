package com.tencent.matrix.trace.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileUtil {

    public static void saveToFile(String content, String filePath, String fileName, Context context) {
        if(TextUtils.isEmpty(filePath)){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                filePath = context.getDataDir().getPath();
            }
        }
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
