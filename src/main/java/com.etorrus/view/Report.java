package com.etorrus.view;

import com.etorrus.model.document.Document;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.DocumentWrapperManager;
import com.etorrus.wrapper.PersonWrapperManager;

import java.util.List;

/**Отчет должен содержать перечень авторов документов
 * и список документов созданных ими*/

public class Report {

    public void getReport(){

        System.out.println("==========REPORT==========");

        List<Person> personList = PersonWrapperManager.getPersonList();
        List<Document> documentList = DocumentWrapperManager.getDocumentList();

        for (Person author : personList){
            System.out.println(author.getLastName() + " " + author.getFirstName() + " " + author.getPatronymic());
            for (Document document : documentList){
                //System.out.println(document.getName() + "От " + document.getDateReg());

                if (author.getId().equals(document.getAuthor().getId())){
                    System.out.println("        " + document.getName() + "От " + document.getDateReg());
                }
            }
        }
    }
}
