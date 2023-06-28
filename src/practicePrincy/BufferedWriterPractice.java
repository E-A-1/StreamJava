package practicePrincy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedWriterPractice {
    public static void main(String[] args) throws IOException {
        // InputStream Reader is a main class for reading data from sources like file ,
        // console ,sockets
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Please enter whatever you want");

        String data = bufferedReader.readLine();

        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example.txt"));
        bufferedWriter.write(data);
        bufferedWriter.close();

    }
}
