package serilizationdeserilization;


import java.io.*;

class Test implements Serializable {
    int a = 100;
    int b = 400;
}

public class Serialization {

    public Serialization() throws IOException, ClassNotFoundException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test test = new Test();
        //serilization
        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(test);


        //Deserilization

        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test t2 = (Test) ois.readObject();
        System.out.println(t2.a + "  " + t2.b);
    }
}