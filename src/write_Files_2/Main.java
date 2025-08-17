package write_Files_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
     
    // For better organisation , We could use this method 

    String filePath = "C:\\Users\\LENOVO\\Desktop\\Java\\src\\write_Files_2\\test.txt";
    // For Single Line of texts!!
    //String textContent = "I like kulcha \nEaten with pindi chole";
    
    //For multilie texts
    String textContent = """
    I like kulcha 
    Eaten with pindi chole
    esecially THE ONCES MADE BY MATAJI!
     """;


    try(FileWriter writer = new FileWriter(filePath)){
    // creat6es a specific file at the specified location
        writer.write(textContent);
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
