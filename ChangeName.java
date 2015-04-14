package com.test;

import java.io.File;

public class Rename {
    public static void main(String[] args) {
       // reName();
//        changeName(new File("E:\\temp"));
        changeName2(new File("E:\\temp"));
    }



    //修改文件名，原始文件名 temp_test1.txt
    public static void changeName(File file){
       if(file.exists()){
           if(file.isDirectory()){
               for (File subfile : file.listFiles()) {
                   if(subfile.isDirectory()){
                       changeName(subfile);
                   }else{
                       String path = subfile.getParentFile().getAbsolutePath();
                       //System.out.println("subfile.getAbsolutePath = " + subfile.getParentFile().getAbsolutePath());
                       File newFile = new File(path, subfile.getName().substring(5));
                       subfile.renameTo(newFile);
                   }
               }

           }else{
               String path = file.getAbsolutePath();
               File newFile = new File(path, file.getName().substring(5));
               file.renameTo(newFile);
           }

       }else{
           System.out.println("文件不存在");
       }
    }

    public static void changeName2(File file){
        if(file.exists()){
            if(file.isDirectory()){
                for(File subfile: file.listFiles()){
                    if(subfile.isDirectory()){
                        changeName2(subfile);
                    } else {
                        String path = subfile.getParentFile().getAbsolutePath();
                        File newFile = new File(path, "temp_"+subfile.getName());
                        subfile.renameTo(newFile);
                    }
                }
            } else {
                String path = file.getAbsolutePath();
                File newFile = new File(path, "temp_"+file.getName());
                file.renameTo(newFile);
            }
        } else {
            System.out.println("文件不存在");
        }
    }



}
