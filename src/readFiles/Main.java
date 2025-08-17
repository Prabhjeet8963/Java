package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        //BufferReader + FileReadear : Best for readingtext files line-by-line 
        //FileInputStream : Best for binary files(e.g images . audio files) 
        //RandomAccessFile : Bestr for read/write specific portions of a large file 

        String filePath = "C:\\Users\\LENOVO\\Desktop\\Java\\src\\readFiles\\text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           
            String line;
           while((line = reader.readLine()) != null){
                System.out.println(line);
           }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Couold not locate file ");
        }
        catch(IOException e ){
            System.out.println("Something went wrong");
        }
    }   
}
