package com.content.java.exception.CheckedException;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CheckedExceptionEg {

    public static void main(String[] args)  {
            try {
                CheckedExceptionEg.readFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public static void readFile () throws IOException {
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream("demo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    }
}
