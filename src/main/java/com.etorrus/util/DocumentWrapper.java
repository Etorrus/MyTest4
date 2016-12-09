package com.etorrus.util;


import com.etorrus.model.document.Document;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class DocumentWrapper {

    public List<Document> documents = new ArrayList<Document>();

    public List<Document> getDocuments() {
        return documents;
    }

    @XmlElement
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }


}
