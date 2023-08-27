package Lesson26;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson26 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/Lesson26/file.txt");
        write(path.toFile());
        FileInputStream inputStream = new FileInputStream(path.toFile());
        System.out.println(read(inputStream));

    }

    private static void write(File file) throws IOException {

        try (FileOutputStream write = new FileOutputStream(file)) {
            String string = "New text";
            write.write(string.getBytes(StandardCharsets.UTF_8));
        }

    }

    private static String read(InputStream inputStream) throws IOException {

        StringBuilder out = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String outText;
            while ((outText = bufferedReader.readLine()) != null) {
                out.append(outText).append("/n");
            }
        }
        return out.toString();

    }

}
