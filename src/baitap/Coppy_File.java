package baitap;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Coppy_File {
    public static void main(String[] args) throws IOException {
        File origin = new File("origin.txt");
        File coppyorigin = new File("coppyorigin.txt");
        if (!origin.exists()){
            origin.createNewFile();
        }
        if (!coppyorigin.exists()){
            coppyorigin.createNewFile();
        }
        copyFile(origin,coppyorigin);
        System.out.println("Coppy thành công ");
    }
    public static void copyFile(File origin,File copyorigin) throws IOException {
        FileReader fileReader= new FileReader(origin);
        FileWriter fileWriter = new FileWriter(copyorigin);
        int sum;
        while ((sum =fileReader.read()) !=-1){
            fileWriter.write(sum);
        }
        fileReader.close();
        fileWriter.close();
    }
}
