package com.examples.filereaderfirst;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("myPerson.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data = bufferedReader.readLine();
        bufferedReader.close();

        String[] props = data.split(";");
        Person person = new Person(props[0], Integer.parseInt(props[1]), props[2]);
        System.out.println(person);
    }
}
