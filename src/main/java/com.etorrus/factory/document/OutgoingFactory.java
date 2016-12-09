package com.etorrus.factory.document;

import com.etorrus.model.document.Document;
import com.etorrus.model.document.Outgoing;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.PersonWrapperManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class OutgoingFactory extends DocumentFactory {

    public List<Document> getList(int count) {
        List<Document> result = new ArrayList<Document>();
        for (int i = 0; i < count; i++) {
            result.add(create(i));
        }
        return result;
    }
    public Outgoing create(int i) {
        Outgoing outgoing = new Outgoing();

        outgoing.setId(UUID.randomUUID());
        outgoing.setName("Outgoing_");
        outgoing.setText("Text text");
        outgoing.setRegNum("o-00" + outgoing.getId());
        outgoing.setDateReg(new Date());

        final List<Person> personList = PersonWrapperManager.getPersonList();
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
