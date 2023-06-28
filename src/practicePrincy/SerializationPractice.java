package practicePrincy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPractice {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person firstPerson = new Person("Princy", "23");
        // Creating file out stream instance , since we are going to write in a file
        FileOutputStream fileOut = new FileOutputStream("object.txt");
        // Using object object output stream ,
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        // writing the object in the file
        out.writeObject(firstPerson);

        out.close();
        fileOut.close();
        // Using file input stream to read object.txt file, since its a file
        FileInputStream fileInputStream = new FileInputStream("object.txt");
        // Object input stream
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object data = objectInputStream.readObject();

        Person person = (Person) data;

        System.out.println("Person name " + person.name);
        System.out.println("Person age " + person.age);

        objectInputStream.close();

        fileInputStream.close();

    }
}
