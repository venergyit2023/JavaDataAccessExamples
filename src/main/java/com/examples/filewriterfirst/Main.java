package com.examples.filewriterfirst;

import java.io.FileWriter;

public class Main {

    public static void main (String[] args) throws Exception {

        Person person = new Person("Vladan Ulardzic",25,"1234AA");
        FileWriter fwPerson = new FileWriter("myPerson.txt");
        fwPerson.write(person.toString() + "\n");
        fwPerson.close();

        Person person2 = new Person("Petar Petrovic", 21, "1234AB");
        FileWriter fwPerson2 = new FileWriter("C:/MyJava/myFile2.txt");
        fwPerson2.write(person2.toString() + "\n");
        fwPerson2.close();
    }

}

