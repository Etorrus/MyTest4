package com.etorrus.factory.document;

import com.etorrus.model.document.Document;
import com.etorrus.model.document.Incoming;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.PersonWrapperManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class IncomingFactory extends DocumentFactory {

    public List<Document> getList(int count) {
        List<Document> result = new ArrayList<Document>();
        for (int i = 0; i < count; i++) {
            result.add(create(i));
        }
        return result;
    }


    public Incoming create(int i) {
        Incoming incoming = new Incoming();

        incoming.setId(UUID.randomUUID());
        incoming.setName("Incoming_");
        incoming.setText("Text text");
        incoming.setRegNum("i-00" + incoming.getId());
        incoming.setDateReg(new Date());

        final List<Person> personList = PersonWrapperManager.getPersonList();
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
