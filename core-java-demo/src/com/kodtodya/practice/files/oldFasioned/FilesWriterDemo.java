package com.kodtodya.practice.files.oldFasioned;

import java.io.FileWriter;
import java.io.IOException;

public class FilesWriterDemo {

    private static final String FILE_PATH = "C:\\Users\\kodtodya\\Downloads\\fileDemo\\";

    private static final String FILE_NAME = "text.txt";

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH + FILE_NAME);
            // writing the content into the FileOperationExample.txt file
            fileWriter.write("This is sample data written to file..\n\nThis data is written to new line in this file.");

            System.out.println("Content is successfully written to the file.");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("closing file writer..");
            // Closing the stream
            fileWriter.close();
        }
    }
}
