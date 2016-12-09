package com.etorrus;


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
import java.util.List;

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

        IncomingFactory incomingFactory = new IncomingFactory();
        List<Incoming> incomingList = incomingFactory.getList(5);
        OutgoingFactory outgoingFactory = new OutgoingFactory();
        List<Outgoing> outgoingList = outgoingFactory.getList(5);
        TaskFactory taskFactory = new TaskFactory();
        List<Task> taskList = taskFactory.getList(5);



        File fileDocuments = new File("E:/xmlDocument/documentList.xml");
        DocumentWrapper documentWrapper = new DocumentWrapper();


        Report rep = new Report();
        rep.getReport();

    }
}
