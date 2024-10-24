package com.examples.filewritefour.persistence;

import com.examples.filewritefour.Person;

import java.util.List;

public interface Dao<E> {

    /**
     * <p>
     *  This method has to read persistance elements and retreive the List of elements.
     * </p>
     *
     * @return elements
     * @throws DaoException
     *
     * */

    List<E> readElements() throws DaoException;

    /**
     * <p>
     *  This method has to save data in some kind of storage (JSON, file, XML, MySQL).
     * </p
     *
     * @return elements
     * @throws DaoException
     * */
    void writeElements(List<E> elements) throws DaoException;


}
