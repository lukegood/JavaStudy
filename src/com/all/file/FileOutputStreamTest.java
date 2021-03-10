package com.all.file;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamTest{
    public static void main(String[] args) throws Exception{
        File file = new File("files/hello.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file);
        String str = "JavaStudy!";
        byte[] data = str.getBytes();
        output.write(data);
        output.close();
    }
}
