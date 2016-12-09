package com.etorrus.factory.document;

import com.etorrus.model.document.Document;
import java.util.List;

public class DocumentFactory {

    public enum DocType {
        TASK,
        INCOMING,
        OUTGOING
    }

    public List<Document> getDoc(DocType docType, int count) {
        switch (docType) {
            case TASK: {
                TaskFactory taskFactory = new TaskFactory();
                List<Document> taskList = taskFactory.getList(count);
                return taskList;
            }
            case INCOMING: {
                IncomingFactory incomingFactory = new IncomingFactory();
                List<Document> incomingList = incomingFactory.getList(count);
                return incomingList;
            }
            case OUTGOING: {
                OutgoingFactory outgoingFactory = new OutgoingFactory();
                List<Document> outgoingList = outgoingFactory.getList(count);
                return outgoingList;
            }
            default: {
                return null;
            }
        }
    }
}
