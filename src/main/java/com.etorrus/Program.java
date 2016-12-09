package com.etorrus;


import com.etorrus.factory.document.DocumentFactory;
import com.etorrus.model.document.Document;
import com.etorrus.model.document.Incoming;
import com.etorrus.model.document.Outgoing;
import com.etorrus.model.document.Task;
import com.etorrus.factory.document.IncomingFactory;
import com.etorrus.factory.document.OutgoingFactory;
import com.etorrus.factory.document.TaskFactory;
import com.etorrus.factory.staff.PersonFactory;
import com.etorrus.util.DocumentWrapper;
import com.etorrus.view.Report;
import com.etorrus.model.staff.Person;
import com.etorrus.util.PersonWrapper;
import com.etorrus.dao.JaxbParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.etorrus.factory.document.DocumentFactory.DocType.INCOMING;
import static com.etorrus.factory.document.DocumentFactory.DocType.OUTGOING;
import static com.etorrus.factory.document.DocumentFactory.DocType.TASK;

public class Program {


    public static void main(String[] args) throws Exception {

        PersonFactory personFactory = new PersonFactory();

        List<Person> personList = personFactory.getList(5);
        System.out.println(personList.get(3).getId());

        JaxbParser parser = new JaxbParser();
        File filePersons = new File("E:/xmlDocument/personList.xml");

        PersonWrapper personWrapper = new PersonWrapper();
        personWrapper.setPersonList(personList);
        parser.staffToXML(filePersons, personWrapper);


        //DocumentWrapper documentWrapper = new DocumentWrapper();
        //List<Document> documentList = new DocumentWrapper().getDocuments();

        List<Document> documentList = new ArrayList<Document>();

        DocumentFactory documentFactory = new DocumentFactory();
        documentFactory.getDoc(TASK, 5);
        documentFactory.getDoc(INCOMING, 5);
        documentFactory.getDoc(OUTGOING, 5);
        documentList.add(documentFactory.getDoc(TASK, 2).get(0));



        /*File fileDocuments = new File("E:/xmlDocument/documentList.xml");
        DocumentWrapper documentWrapper = new DocumentWrapper();*/


        Report rep = new Report();
        rep.getReport();

    }
}
