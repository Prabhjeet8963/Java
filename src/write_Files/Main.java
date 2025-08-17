package write_Files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
     
    // How to write a file using java?

    //Filewriter = gOOD FOR SMALL OR MEDIUM-Sized text files 
    //BufferWritter = better performance for large amounts of text
    //Printwriter = best for structured data like reports or logs 
    //FileOutputStream = Best for binary files (e.g images , audio files)

    

    //try(FileWriter writer = new FileWriter("test.txt")) //  creates a text file outside src in the java folder 
    try(FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\Java\\src\\write_Files\\test.txt")){
    // creat6es a specific file at the specified location
        writer.write("I like kulcha \nEaten with pindi chole");
        writer.write("\nI am writing inside a file , yay!");
        System.out.println("File has been written");
    }
    
    catch(FileNotFoundException e){
        System.out.println("Could not locate file location");
        
    }
    catch(IOException e){
        System.out.println("Could not write file");
     }
    }
}
