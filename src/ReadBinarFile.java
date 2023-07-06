import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadBinarFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("binaryFile.txt"));
        String line;
        StringBuilder sixteenBitBinary = new StringBuilder();
        StringBuilder eightBitBinary = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            System.out.println(line + " " + "length" + line.length());
            if (line.length() == 16) {
                sixteenBitBinary.append(line).append(System.lineSeparator());
            } else if (line.length() == 8) {
                eightBitBinary.append(line).append(System.lineSeparator());

            } else {
                System.out.println("Invalid binary digit");
            }
        }

        System.out.println("eight bit binary" + eightBitBinary);
        System.out.println("sixteen bit binary " + sixteenBitBinary);

        // Writing the 8 bit binary file
        writeBinaryToFile("eightBitBinary.txt", eightBitBinary.toString());

        // Writing the 16 bit binary file

        writeBinaryToFile("sixteenBitBinary.txt", sixteenBitBinary.toString());
        reader.close();

    }

    public static void readBinaryFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("binaryFile.txt"));
        String binaryValue = "";
        while (reader.read() != -1) {
            binaryValue += (char) reader.read();
        }

        String[] binaryArray = binaryValue.split(" ");
        ArrayList<String> eightBitArray = new ArrayList<>();
        ArrayList<String> sixteenBitArray = new ArrayList<>();
        for (String bString : binaryArray) {
            System.out.println(bString);
        }

        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i].length() == 16) {
                System.out.println("Inside the sixteen bit");
                sixteenBitArray.add(binaryArray[i]);
            } else if (binaryArray[i].length() == 8) {
                eightBitArray.add(binaryArray[i]);

            } else {
                System.out.println("Invalid value");
            }
        }
        System.out.println("binary array lenght is " + binaryValue.length());
        System.out.println("eightBitArray length is " + eightBitArray.size());

        System.out.println("sixteenBitArray length is " + sixteenBitArray.size());
        StringBuilder eightBitString = new StringBuilder();
        StringBuilder sixteenBitString = new StringBuilder();

        for (String element : eightBitArray) {
            eightBitString.append(element).append(" ");
        }

        for (String element : sixteenBitArray) {
            sixteenBitString.append(element).append(" ");
        }

        // Writing the 8 bit binary file
        writeBinaryToFile("eightBitBinary22.txt", eightBitString.toString());

        // Writing the 16 bit binary file

        writeBinaryToFile("sixteenBitBinary22.txt", sixteenBitString.toString());

    }

    public static void writeBinaryToFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
