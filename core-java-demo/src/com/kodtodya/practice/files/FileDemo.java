package com.kodtodya.practice.files;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        // string block content declaration in till Java-11
        String content = "hello world, this is sample content that actually needs to be "
                + "written in File using Java-11 new File API.\nLet's perform this activity.";

        // string block content declaration in Java-17
        content = """
                hello world, this is sample content that actually needs to be written in File using Java-11 new File API.
                Let's perform this activity.
                """;

        //String tempFolder = "/home/kodtodya/Downloads/fileDemo";
        String tempFolder = "C:\\Users\\kodtodya\\Downloads\\fileDemo\\";

        //String tempFolder = System.getProperty("java.io.tmpdir");

        // Create Path from a sequence of Strings
        Path filePath = Path.of(tempFolder, "content.txt");
        System.out.println("Path : " + filePath);
        System.out.println("Files Exists : " + Files.exists(filePath));
        System.out.println("-----------------------------------------------------");

        // write content to file
        filePath = Files.writeString(filePath, content);
        System.out.println("Path after writing content to file: " + filePath);
        System.out.println("-----------------------------------------------------");

        // check is file exist after writing content to new file
        boolean isExist = Files.exists(filePath);
        System.out.println("File exist after writing content to new file : " + isExist);
        System.out.println("-----------------------------------------------------");

        // reading what we wrote to file
        System.out.println("Data of file present at " + filePath + " :");
        Stream<String> data = Files.lines(filePath);
        data.forEach(System.out::println);
        data.close();
        System.out.println("-----------------------------------------------------");

        // delete file
        Files.deleteIfExists(filePath);
        System.out.println("File deleted. Does it still exists : " + Files.exists(filePath));
        System.out.println("-----------------------------------------------------");

        boolean isWritable = Files.isWritable(filePath);
        System.out.println("Is path writable : " + isWritable);
        System.out.println("-----------------------------------------------------");

        // write same content again with charset preference
        Charset charset = Charset.forName("ISO-8859-3");
        filePath = Files.writeString(filePath, content, charset);
        System.out.println("File written. Let's read it again.");
        Files.lines(filePath, charset).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        System.out.println("Great, lets read it using readString() method.");
        System.out.println(Files.readString(filePath)); //Files.readString(filePath, charset);
        System.out.println("-----------------------------------------------------");

        // Copy file to parent folder
        Files.copy(filePath, Path.of(filePath.getParent().toString()
                + filePath.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied to " + Path.of(filePath.getParent().toString() +
                filePath.getFileName()) + " ; is it exist now : " +
                Files.exists(Path.of(filePath.getParent().toString() + filePath.getFileName())));
        System.out.println("-----------------------------------------------------");

        //Move copied file back to base location and replace if existing
        Files.move(Path.of(filePath.getParent().toString()
                + filePath.getFileName()), filePath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved back to " + filePath
                + " ; is copied file still available in parent folder : "
                + Files.exists(Path.of(filePath.getParent().toString() + filePath.getFileName())));
        System.out.println("-----------------------------------------------------");
        // delete file
        System.out.println("File deleted : " + Files.deleteIfExists(filePath));
        System.out.println("-----------------------------------------------------");

        // create temp file
        String uriFullPath = "file:///" + tempFolder.replace("\\", "/") + "content.txt";
        URI uri = URI.create(uriFullPath);
        System.out.println("Created URI to demonstrate URI API : " + uri);
        System.out.println("-----------------------------------------------------");
        filePath = null;

        // Create Path from a URI
        filePath = Path.of(uri);
        System.out.println("File path created from URI : " + filePath);
        System.out.println("-----------------------------------------------------");

        // create temp folder
        filePath = Files.createTempDirectory(filePath.getParent(), "_");
        System.out.println("Filepath after creating temporary folder : " + filePath);
        System.out.println("-----------------------------------------------------");

        // create temp file
        filePath = Files.createTempFile("test-temp-file", ".txt");
        System.out.println("Filepath after creating temporary folder : " + filePath);
        File tempFile = filePath.toFile();
        tempFile.deleteOnExit();
        filePath = Files.writeString(filePath, content);
        System.out.println("Temp file created and written at path  : " + filePath);
        System.out.println("-----------------------------------------------------");

        // read file as a List<String>
        List<String> listOfLines = Files.readAllLines(filePath, charset); // Files.readAllLines(filePath);
        listOfLines.forEach(System.out::println);

        System.out.println("Delete file at last : " + Files.deleteIfExists(filePath));

    }
}
