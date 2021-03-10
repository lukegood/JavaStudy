package com.all.file;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest {
    public static void main(String[] args) throws Exception{
        File file = new File("files/hello2.txt");
        if(file.exists()){
            Reader rd = new FileReader(file);
            char[] buf = new char[1024];
            int len = rd.read(buf);
            System.out.println(new String(buf, 0, len));
            rd.close();
        }
    }
}
