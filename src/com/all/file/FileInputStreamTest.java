package com.all.file;
import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) throws Exception {
        File file = new File("files/hello.txt");
        if(file.exists()){
            InputStream input = new FileInputStream(file);
            byte[] data = new byte[1024];
            int len = input.read(data);
            System.out.println(new String(data, 0, len));
            input.close();
        }
    }
}
