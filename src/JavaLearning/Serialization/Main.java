package JavaLearning.Serialization;

import java.io.*;


/*
    Para serializar un objeto:
    1. La clase del objeto que quieres serializar debera de implementar la interfaz 'Serializable'
    2. Se importa java.io.Serializable
    3. FileOutputStream fileOut = new FileOutputStream(file path)
    4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
    5. out.writeObject(ObjectName)
    6. out.close(); fileOut.close();
*/

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User("Bro", "i<3Pizza");

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved");
    }
}
