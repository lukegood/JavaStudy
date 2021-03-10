package com.all.file;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) throws Exception{
        File file = new File("files/hello2.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer fw = new FileWriter(file);
        String str = "JavaStudy2!";
        fw.write(str);
        fw.close();
    }
}
