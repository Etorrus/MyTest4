package com.etorrus.service;


import com.etorrus.documents.Document;
import com.etorrus.staffs.Person;
import com.etorrus.staffs.Staff;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class DocumentWrapper {


    public List<Document> docs = new ArrayList<Document>();


    public List<Staff> staffs = new ArrayList<Staff>();

    public List<Document> getDocs() {
        return docs;
    }

    public void setDocs(List<Document> docs) {
        this.docs = docs;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

}
