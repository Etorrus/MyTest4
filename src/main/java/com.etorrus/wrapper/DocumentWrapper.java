package com.etorrus.wrapper;


import com.etorrus.model.document.Document;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class DocumentWrapper {

    private List<Document> documentList = new ArrayList<Document>();

    public List<Document> getDocumentList() {
        return documentList;
    }
    @XmlElement
    public void setDocumentList(List<Document> documents) {
        this.documentList = documents;
    }
}
