package Lesson25;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson25 {

    public static void main(String[] args) {

        File file = new File("src/Lesson25/file.txt");
        writeToFile(file, "Write to file complete");
        readFromFile(file);

    }

    static void writeToFile (File file, String string) {
        if(!file.exists()) {
            try(FileWriter write = new FileWriter(file)) {
                write.write(string);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void readFromFile (File file){
        StringBuilder readFile = new StringBuilder();
        try (FileReader read = new FileReader(file)){
            int ch;
            while ((ch = read.read()) != -1) {
                readFile.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(readFile);
    }

}
