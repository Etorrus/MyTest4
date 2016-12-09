package com.etorrus.factory.document;

import com.etorrus.model.document.Outgoing;
import com.etorrus.model.staff.Person;
import com.etorrus.service.PersonService;

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

        outgoing.setId(1 + (int)Math.random() *100);
        outgoing.setName("Outgoing_" + outgoing.getId());
        outgoing.setText("Text text");
        outgoing.setRegNum("o-00" + outgoing.getId() + i);
        outgoing.setDateReg(new Date());


        /*final JaxbParser parser = new JaxbParser();
        final File file = new File("E:/xmlDocument/personList.xml");
        final PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);*/
        final List<Person> personList = PersonService.getPersonList();
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
