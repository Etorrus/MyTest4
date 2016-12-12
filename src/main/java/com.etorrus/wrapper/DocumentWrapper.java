package com.etorrus.wrapper;


import com.etorrus.model.document.Document;
import com.etorrus.model.document.Incoming;
import com.etorrus.model.document.Outgoing;
import com.etorrus.model.document.Task;
import com.etorrus.model.staff.Department;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * тут хранятся все сгенерированые Document
 */
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlSeeAlso({
        Outgoing.class,
        Incoming.class,
        Task.class})
public class DocumentWrapper {

    //@XmlElements({ @XmlElement(name="OUTGOING", type=Outgoing.class)});

    public DocumentWrapper(){

    }

    private List<Document> documentList = new ArrayList<Document>();

    public List<Document> getDocumentList() {
        return documentList;
    }
    @XmlElement
    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }
}
