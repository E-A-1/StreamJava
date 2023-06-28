package practicePrincy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hello");
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);

        }

    }
}
