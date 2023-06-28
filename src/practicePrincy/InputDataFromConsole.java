package practicePrincy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDataFromConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // FileReader fileReader = new FileReader("oneLiner.txt");

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter your details");

        String detail = bufferedReader.readLine();

        System.out.println("entered detail is " + detail);
    }
}
