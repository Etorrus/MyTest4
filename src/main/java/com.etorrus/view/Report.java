package com.etorrus.view;

import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.PersonWrapperManager;

import java.util.List;

/**Отчет должен содержать перечень авторов документов
 * и список документов созданных ими*/

public class Report {

    public void getReport(){

        System.out.println("==========REPORT==========");

        List<Person> personList = PersonWrapperManager.getPersonList();

        for (Person author : personList){
            System.out.println(author.getLastName() + " " + author.getFirstName() + " " + author.getPatronymic());

        }
    }
}
