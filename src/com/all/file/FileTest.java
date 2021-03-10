package com.all.file;
import java.io.File;

public class FileTest {
    public static void main(String[] args) throws Exception {
        File file = new File(File.separator + "home" + File.separator + "wlg" + File.separator + "Downloads");
        print(file);
    }

    public static void print(File file){
        if(file.isDirectory()){
            File[] result = file.listFiles();
            for(File f : result){
                print(f);
            }
        }
        System.out.println(file);
    }
}
