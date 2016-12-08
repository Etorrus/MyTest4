package com.etorrus;


import com.etorrus.documents.Incoming;
import com.etorrus.factorys.DocumentFactory;
import com.etorrus.factorys.IncomingFactory;
import com.etorrus.factorys.PersonFactory;
import com.etorrus.staffs.Person;
import com.etorrus.staffs.PersonWrapper;
import com.etorrus.util.JaxbParser;

import java.io.File;
import java.util.List;

import static com.etorrus.factorys.DocumentFactory.DocType.INCOMING;

public class Program {


    public static void main(String[] args) throws Exception {

        PersonFactory personFactory = new PersonFactory();

        List<Person> list = personFactory.getList(5);
        System.out.println(list.get(3).getId());

        JaxbParser parser = new JaxbParser();
        File file = new File("personList.xml");

        PersonWrapper personWrapper = new PersonWrapper();
        personWrapper.setPersonList(list);
        parser.staffToXML(file, personWrapper);


        /*personWrapper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);*/
        System.out.println(((PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class)).getPersonList().get(3));
        IncomingFactory incomingFactory = new IncomingFactory();
        List<Incoming> incomingList = incomingFactory.getList(5);



        /*List<Person> persons = new ArrayList<Person>();

        File file = new File("person.xml");

        parser.staffToXML(file, person);
        person = (Person) parser.XMLToStaff(file, Person.class);

        DocumentFactory factory = new DocumentFactory();




        Report rep = new Report();
        rep.getReport();*/

    }
}
