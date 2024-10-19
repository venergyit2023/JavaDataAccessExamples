package src;

import java.io.FileWriter;

public class Main {

    public static void main (String[] args) throws Exception {

        Person person = new Person("Vladan Ulardzic",25,"1234AA");

        FileWriter fwPerson = new FileWriter("myPerson.txt");
        fwPerson.write(person.toString() + "\n");
        fwPerson.close();
    }

}

