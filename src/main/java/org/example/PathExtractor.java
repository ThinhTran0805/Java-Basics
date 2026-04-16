package org.example;

import java.io.File;

public class PathExtractor {
    public static void main(String[] args) {
        String path = "D:/galailaptrinh/music/remix.mp3";

        //de khong bo sot / hoac \ trong duong dan, tim vi tri cuoi cung nhat
        int lastString = Math.max(path.lastIndexOf("/"), path.lastIndexOf("\\"));
        System.out.println(lastString);

        //cat lay ten tep can dung. Tu vi tri / cuoi cung
        String fileName = path.substring(lastString + 1);
        //cat lay ten file
        int indexName = fileName.lastIndexOf(".");
        String Name = fileName.substring(0, indexName);

//        //C2: Dung thu vien File
//        File file = new File(path);
//        String fileName = file.getName();
//        int indexName  = fileName.lastIndexOf(".");
//        String Name = fileName.substring(0, indexName);

        System.out.println("Ten file lay duoc la: " + fileName);
        System.out.println("Ten file khong co duoi . la : " + Name);
    }
}
