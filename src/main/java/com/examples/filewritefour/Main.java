package com.examples.filewritefour;

import com.examples.filewritefour.persistence.DaoException;
import com.examples.filewritefour.persistence.person.PersonDao;
import com.examples.filewritefour.persistence.person.file.FilePersonDao;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws DaoException {

        Person person = new Person("012345678", "Rade", "Radovanovic",23);
        Person person2 = new Person("012345672", "Ana", "Petrovic",13);
        Person person3 = new Person("012345674", "Milan", "Djorjevic",23);
        Person person4 = new Person("012345676", "Goran", "Bregovic",33);
        Person person5 = new Person("012345670", "Zarko", "Zaric",18);
        Person person6 = new Person("012345670", "Zarko", "Zaric",28);
        Person person7 = new Person("012345670", "Zarko", "Zaric",14);

        List<Person> personList = List.of(person, person2, person3, person4, person5);

        PersonDao personDao = new FilePersonDao();
        personDao.writeElements(personList);





    }


}
