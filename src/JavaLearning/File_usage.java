package JavaLearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_usage {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Thega\\OneDrive\\Escritorio\\Secret_folder.txt");

        if(file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete()
        }
        else {
            System.out.println("That file does not exists");
        }

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nviolets are blue");
            writer.append("\n A little poem");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("art.txt");
            //FileReader => reads the content of a file as a stream of characters. One by one
            // read() returns an int value which contains the bite value. When read returns -1, there is no more data to read.
            
            int data = reader.read();
            while (data!=-1) {
                System.out.print((char)data);
                data = reader.read(); 
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
