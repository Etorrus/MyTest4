package com.etorrus.view;

import com.etorrus.model.document.Document;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.DocumentWrapperManager;
import com.etorrus.wrapper.PersonWrapperManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**Отчет должен содержать перечень авторов документов
 * и список документов созданных ими
 * и сохранять отчет по каждому автору в отдельный файл
 * в формате json*/

public class Report {

    public void getReport(){

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        System.out.println("==========REPORT==========");
        List<Person> personList = PersonWrapperManager.getPersonList();
        Collections.sort(personList);
        List<Document> documentList = DocumentWrapperManager.getDocumentList();
        Collections.sort(documentList);

        String json;

        for (Person author : personList){
            System.out.println(author.getLastName() + " " + author.getFirstName() + " " + author.getPatronymic());
            List<Document> reportAuthor = new ArrayList<Document>();
            for (Document document : documentList){

                if (author.getId().equals(document.getAuthor().getId())){
                    reportAuthor.add(document);
                    System.out.println("        " + document.getName() + "От " + document.getDateReg());
                }
            }

            json = gson.toJson(reportAuthor);
            try {
                FileWriter writer = new FileWriter("E:/xmlDocument/" + author.getLastName() + ".json");
                writer.write(json);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
