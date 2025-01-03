package com.examples.filewritefour.persistence.person.file;

import com.examples.filewritefour.Person;
import com.examples.filewritefour.persistence.DaoException;
import com.examples.filewritefour.persistence.person.PersonDao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FilePersonDao implements PersonDao {

    public static final String PERSONS_TXT = "persons.txt";


    @Override
    public List<Person> readElements() throws DaoException {

        try (BufferedReader in = new BufferedReader(new FileReader(PERSONS_TXT))){
            List<Person> personList = new ArrayList<>();
            String line;
            while ((line=in.readLine())!=null) {
                // ssn; name, surname; age
                StringTokenizer tokenizer = new StringTokenizer(line,";");
                String ssn = tokenizer.nextToken();
                String name = tokenizer.nextToken();
                String surname = tokenizer.nextToken();
                Integer age = Integer.parseInt(tokenizer.nextToken());
                Person person = new Person(ssn,name, surname, age);
                personList.add(person);
            }
            return personList;
        } catch (FileNotFoundException e) {
            throw new DaoException(e.getMessage());
        } catch (IOException e) {
            throw new DaoException(e.getMessage());
        }

    }

    @Override
    public void writeElements(List<Person> persons) throws DaoException {
        if (persons == null || persons.isEmpty()){
            return;
        }

        try (PrintWriter out = new PrintWriter( new FileWriter(PERSONS_TXT))) {
            // ssn; name, surname; age
            for (Person person : persons) {
                out.println(person.getSocialSecurityNumber() +
                        ";" + person.getName() +
                        ";" + person.getSurname() +
                        ";" + person.getAge());
            }
        } catch (IOException e) {
            throw new DaoException(e.getMessage());
        }


    }
}
