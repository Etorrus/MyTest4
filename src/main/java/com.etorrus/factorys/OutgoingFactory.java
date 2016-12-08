package com.etorrus.factorys;

import com.etorrus.documents.Document;
import com.etorrus.documents.Outgoing;

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
        outgoing.setName("Incoming_" + Document.getCount());
        outgoing.setText("Text text");
        outgoing.setRegNum("o-00" + Document.getCount() + i);
        outgoing.setDateReg(new Date());






        return outgoing;
    }
}
