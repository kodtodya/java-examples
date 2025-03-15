package com.kodtodya.practice.files.oldFasioned;

import java.io.File;
import java.util.Arrays;

public class FilesOperationDemo {

    private static final String FILE_PATH = "C:\\Users\\kodtodya\\Downloads\\fileDemo\\";
    private static final String FILE_NAME = "text.txt";

    public static void main(String[] args) {

        File myFolder = new File(FILE_PATH);
        File myFile = new File(FILE_PATH + FILE_NAME);

        System.out.println("------------------------------------------------");
        if (myFile.isFile()) {
            System.out.println( FILE_NAME + " present at " + FILE_PATH + " is a file and not a folder.");
        }

        if (!myFile.isDirectory()) {
            System.out.println( FILE_PATH + " is a file and not a folder.");
        }

        System.out.println("------------------------------------------------");
        if (myFolder.isDirectory()) {
            System.out.println( FILE_PATH + " is a folder and not a file.");
        }
        System.out.println("------------------------------------------------");

        if (myFile.exists()) {
            System.out.println( FILE_NAME + " is already created.");
        }
        System.out.println("------------------------------------------------");

        if (myFolder.exists()) {
            System.out.println( FILE_PATH + " folder is already created.");
        }
        System.out.println("------------------------------------------------");

        if (myFolder.canRead()) {
            System.out.println( FILE_PATH + " is readable.");
        }
        System.out.println("------------------------------------------------");

        if (myFile.canRead()) {
            System.out.println( FILE_NAME + " is readable.");
        }
        System.out.println("------------------------------------------------");

        if (myFile.canExecute()) {
            System.out.println( FILE_NAME + " can be executed.");
        }
        System.out.println("------------------------------------------------");

        if (myFile.canWrite()) {
            System.out.println( FILE_NAME + " file has edit permissions.");
        }
        System.out.println("------------------------------------------------");

        if (!myFile.isHidden()) {
            System.out.println( FILE_NAME + " is a not a hidden file.");
        }
        System.out.println("------------------------------------------------");

        System.out.println( "List of files present inside " + FILE_PATH + ":" + Arrays.stream(myFolder.list()).toList());
        System.out.println("------------------------------------------------");
        System.out.println( "Parent folder of '" + FILE_PATH + "' -> " + myFolder.getParent());
        System.out.println("------------------------------------------------");

        System.out.println( "Free space in disk at " + FILE_PATH + ":" + (myFolder.getFreeSpace()/1024) + " kb");
        System.out.println( "Free space in disk at " + FILE_PATH + ":" + (myFolder.getFreeSpace()/1024/1024) + " mb");
        System.out.println( "Free space in disk at " + FILE_PATH + ":" + (myFolder.getFreeSpace()/1024/1024/1024) + " gb");
        System.out.println("------------------------------------------------");

        File newFolder = new File(FILE_PATH + "new-folder");
        if (newFolder.mkdir()) {
            System.out.println("New folder has been created inside " + FILE_PATH + " named as new-folder");
        }

        System.out.println("------------------------------------------------");
        if (newFolder.delete()) {
            System.out.println("New folder has been deleted from " + FILE_PATH);
        }
        System.out.println("------------------------------------------------");
    }
}
