//File Not Found Exception Handling
//Write a program to read a filename from the user and display its
//content. The program should handle the situation where the file
//does not exist.
//Key Points:
//• Use Scanner to read the filename from the user.
//• Use FileReader to read the file content.
//• Implement a try-catch block to handle FileNotFoundException.
//• Display a message informing the user if the file is not found.
package exceptionNfileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String fileName = in.next();
        try(FileReader reader = new FileReader(fileName)){
            int read;
            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found "+e.getMessage());
        } catch(IOException e){
            System.out.println("An error occurred: "+e.getMessage());
        }
    }
}
