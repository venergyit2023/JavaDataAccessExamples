package com.examples.filewritefour.persistence.person.file;

import com.examples.filewritefour.Person;
import com.examples.filewritefour.persistence.DaoException;
import com.examples.filewritefour.persistence.person.PersonDao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FilePersonDao implements PersonDao {
    @Override
    public List<Person> readElements() throws DaoException {
        return null;
    }

    @Override
    public void writeElements(List<Person> persons) throws DaoException {
        if (persons == null || persons.isEmpty()){
            return;
        }

        try (PrintWriter out = new PrintWriter( new FileWriter("persons.txt"))) {
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
