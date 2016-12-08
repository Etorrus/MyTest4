package com.etorrus.factorys;

import com.etorrus.documents.Document;
import com.etorrus.documents.Incoming;
import com.etorrus.staffs.Person;
import com.etorrus.util.PersonWrapper;
import com.etorrus.util.JaxbParser;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomingFactory extends DocumentFactory {

    public List<Incoming> getList(int count) {
        List<Incoming> result = new ArrayList<Incoming>();
        for (int i = 0; i < count; i++) {
            result.add(create(i));
        }
        return result;
    }


    public Incoming create(int i) {
        Incoming incoming = new Incoming();

        incoming.setId(Document.getCount());
        incoming.setName("Incoming_" + Document.getCount());
        incoming.setText("Text text");
        incoming.setRegNum("i-00" + Document.getCount() + i);
        incoming.setDateReg(new Date());

        final JaxbParser parser = new JaxbParser();
        final File file = new File("personList.xml");
        final PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);
        final List<Person> personList = personWraper.getPersonList();
        if (personList != null && !personList.isEmpty()) {
            Person author = personList.get(0);
            if (author != null) {
                incoming.setAuthor(author);
            }
            Person sender = personList.get(0);
            if (sender != null) {
                incoming.setSender(sender);
            }
            Person adresse = personList.get(2);
            if (adresse != null){
                incoming.setAdresse(adresse);
            }
        }
        incoming.setOutgoingNum(1 +(int) Math.random() * 20);
        incoming.setOutgoingRegDate(new Date());




        System.out.println("Incoming" + i + " has been created");
        return incoming;
    }
}
