Ques 19)Write a program to copy contents from one file to another. Take input from user for both files.
For Example
Input
Source file : C:\temp\sample.txt
Target file : C:\temp\sample_copy.txt
Output
File(C:\temp\sample.txt) copied sucessfuly.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        try {
            // Input file paths
            String sourceFile = "C:\\temp\\sample.txt";  // Replace with the actual source file path
            String targetFile = "C:\\temp\\sample_copy.txt";  // Replace with the actual target file path

            // Create FileReader and FileWriter objects
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(targetFile);

            // Copy contents from source file to target file
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            // Close the FileReader and FileWriter objects
            reader.close();
            writer.close();

            System.out.println("File(" + sourceFile + ") copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: Unable to copy file.");
            e.printStackTrace();
        }
    }
}