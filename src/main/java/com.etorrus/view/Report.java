package com.etorrus.view;

import com.etorrus.staffs.Person;
import com.etorrus.util.PersonWrapper;
import com.etorrus.dao.JaxbParser;

import java.io.File;
import java.util.List;

/**Отчет должен содержать перечень авторов документов
 * и список документов созданных ими*/

public class Report {

    public void getReport(){

        System.out.println("==========REPORT==========");


        final JaxbParser parser = new JaxbParser();
        final File file = new File("E:/xmlDocument/personList.xml");
        final PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);
        final List<Person> personList = personWraper.getPersonList();

        for (Person author : personList){
            System.out.println(author.getLastName() + " " + author.getFirstName() + " " + author.getPatronymic());

        }
    }
}