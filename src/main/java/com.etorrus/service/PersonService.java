package com.etorrus.service;

import com.etorrus.dao.JaxbParser;
import com.etorrus.model.staff.Person;
import com.etorrus.util.PersonWrapper;

import java.io.File;
import java.util.List;

/**
 * Вытаскивает из xml personList
 */
public class PersonService {

    public static List<Person> getPersonList(){
        JaxbParser parser = new JaxbParser();
        File file = new File("E:/xmlDocument/personList.xml");
        PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);
        List<Person> personList = personWraper.getPersonList();
        return personList;

    }
}
