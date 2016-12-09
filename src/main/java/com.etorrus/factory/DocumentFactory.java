package com.etorrus.factory;

public class DocumentFactory {

    public enum DocType {
        TASK,
        INCOMING,
        OUTGOING
    }

    public DocumentFactory getDoc(DocType docType){

        DocumentFactory documentFactory = null;
        switch (docType) {
            case TASK: {
                documentFactory = new TaskFactory();
                return documentFactory;
            }
            case INCOMING: {
                documentFactory = new IncomingFactory();
                return documentFactory;
            }
            case OUTGOING: {
                documentFactory = new OutgoingFactory();
                return documentFactory;
            }
            default: {
                return null;
            }
        }
    }
}
