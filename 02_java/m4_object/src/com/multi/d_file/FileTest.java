package com.multi.d_file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("test.txt");

        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean result = f.exists();


        System.out.println(result);
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getAbsolutePath());

        File folder =new File("parent");//확장자가 없으면 폴더

        folder.mkdir();

        //System.out.println(folder.isDrectory());
        System.out.println(folder.getName());
    }
}
