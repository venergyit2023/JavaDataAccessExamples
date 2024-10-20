package com.examples.filewritersecond;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main (String[] args) {

        Person person = new Person("Name 1", 22, "1234AC");

        try {
            FileWriter fwPerson3 = new FileWriter("myPerson3.txt");
            fwPerson3.write(person.toString() + "\n");
            fwPerson3.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
