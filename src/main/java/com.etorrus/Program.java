package com.etorrus;


import com.etorrus.documents.Incoming;
import com.etorrus.documents.Outgoing;
import com.etorrus.documents.Task;
import com.etorrus.factorys.*;
import com.etorrus.util.DocumentWrapper;
import com.etorrus.service.Report;
import com.etorrus.staffs.Person;
import com.etorrus.util.PersonWrapper;
import com.etorrus.util.JaxbParser;

import java.io.File;
import java.util.List;

public class Program {


    public static void main(String[] args) throws Exception {

        PersonFactory personFactory = new PersonFactory();

        List<Person> personList = personFactory.getList(5);
        System.out.println(personList.get(3).getId());

        JaxbParser parser = new JaxbParser();
        File filePersons = new File("personList.xml");

        PersonWrapper personWrapper = new PersonWrapper();
        personWrapper.setPersonList(personList);
        parser.staffToXML(filePersons, personWrapper);


        //DocumentWrapper documentWrapper = new DocumentWrapper();
        //List<Document> documentList = new DocumentWrapper().getDocuments();

        //System.out.println(((PersonWrapper) parser.XMLToStaff(filePersons, PersonWrapper.class)).getPersonList().get(3));
        List<Person> personsList = ((PersonWrapper) parser.XMLToStaff(filePersons, PersonWrapper.class)).getPersonList();
        IncomingFactory incomingFactory = new IncomingFactory();
        List<Incoming> incomingList = incomingFactory.getList(5);


        OutgoingFactory outgoingFactory = new OutgoingFactory();
        List<Outgoing> outgoingList = outgoingFactory.getList(5);
        TaskFactory taskFactory = new TaskFactory();
        List<Task> taskList = taskFactory.getList(5);



        File fileDocuments = new File("documentList.xml");
        DocumentWrapper documentWrapper = new DocumentWrapper();





        /*List<Person> persons = new ArrayList<Person>();

        File file = new File("person.xml");

        parser.staffToXML(file, person);
        person = (Person) parser.XMLToStaff(file, Person.class);

        DocumentFactory factory = new DocumentFactory();*/




        Report rep = new Report();
        rep.getReport();

    }
}
