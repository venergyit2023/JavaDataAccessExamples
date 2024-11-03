package com.examples.filereadersecond;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = null;
        FileReader fileReader = new FileReader("input2.txt");
        StringBuilder stringBuilder = new StringBuilder();

        int ch;
        while ((ch = fileReader.read()) !=-1) {
            stringBuilder.append((char) ch);
        }

        String fileData = stringBuilder.toString();
        String[] userProps = fileData.split("\n");
        if(userProps.length ==3) {
            person = new Person(userProps[0], Integer.valueOf(userProps[2]), userProps[1]);
        }

        System.out.println(person);
    }
}
