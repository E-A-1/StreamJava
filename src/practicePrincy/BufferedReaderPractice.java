package practicePrincy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class BufferedReaderPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("oneLiner.txt"));
        int i;
        while ((i = bufferedReader.read()) != -1) {
            System.out.print((char) i);
        }

        System.out.println(" ");
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            // Process the read line
            System.out.println("line" + line);
        }

        bufferedReader.close();
    }
}
