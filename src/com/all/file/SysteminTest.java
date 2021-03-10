package com.all.file;
import java.io.InputStream;

public class SysteminTest {
    public static void main(String[] args) throws Exception{
        InputStream input = System.in;
        StringBuffer buf = new StringBuffer();
        int temp = 0;
        while((temp = input.read()) != -1){
            if(temp == '\n'){
                break;
            }
            buf.append((char)temp);
        }
        System.out.println(buf);
    }
}
