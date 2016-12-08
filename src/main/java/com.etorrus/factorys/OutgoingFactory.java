package com.etorrus.factorys;

import com.etorrus.documents.Document;
import com.etorrus.documents.Outgoing;
import com.etorrus.staffs.Person;
import com.etorrus.util.PersonWrapper;
import com.etorrus.util.JaxbParser;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutgoingFactory extends DocumentFactory {

    public List<Outgoing> getList(int count) {
        List<Outgoing> result = new ArrayList<Outgoing>();
        for (int i = 0; i < count; i++) {
            result.add(create(i));
        }
        return result;
    }
    public Outgoing create(int i) {
        Outgoing outgoing = new Outgoing();

        outgoing.setId(Document.getCount());
        outgoing.setName("Outgoing_" + Document.getCount());
        outgoing.setText("Text text");
        outgoing.setRegNum("o-00" + Document.getCount() + i);
        outgoing.setDateReg(new Date());


        final JaxbParser parser = new JaxbParser();
        final File file = new File("personList.xml");
        final PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);
        final List<Person> personList = personWraper.getPersonList();
        if (personList != null && !personList.isEmpty()) {
            Person author = personList.get(0);
            if (author != null) {
                outgoing.setAuthor(author);
            }
            Person adresse = personList.get(2);
            if (adresse != null){
                outgoing.setAdresse(adresse);
            }
        }
        outgoing.setDeliveryMethod("email");
        System.out.println("Outgoing" + i + " has been created");
        return outgoing;
    }
}
