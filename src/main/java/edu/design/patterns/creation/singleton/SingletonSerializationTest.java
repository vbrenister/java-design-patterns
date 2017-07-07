package edu.design.patterns.creation.singleton;

import java.io.*;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class SingletonSerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        SerializedSingleton instanceTwo;
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("filename.ser"))

        ) {
            out.writeObject(instanceOne);
            instanceTwo = (SerializedSingleton) in.readObject();
        }

        System.out.println("Instance one hashCode=" + instanceOne.hashCode());
        System.out.println("Instance two hashCode=" + instanceTwo.hashCode());
    }
}
