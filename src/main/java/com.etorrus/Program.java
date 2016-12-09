package com.etorrus;


import com.etorrus.factory.document.DocumentFactory;
import com.etorrus.model.document.Document;
import com.etorrus.factory.staff.PersonFactory;
import com.etorrus.view.Report;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.DocumentWrapper;
import com.etorrus.wrapper.PersonWrapper;
import com.etorrus.dao.JaxbParser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.etorrus.factory.document.DocumentFactory.DocType.INCOMING;
import static com.etorrus.factory.document.DocumentFactory.DocType.OUTGOING;
import static com.etorrus.factory.document.DocumentFactory.DocType.TASK;

public class Program {


    public static void main(String[] args) throws Exception {

        JaxbParser parser = new JaxbParser();

        //Создаем людей и кидаем их в personList.xml
        PersonFactory personFactory = new PersonFactory();
        List<Person> personList = personFactory.getList(5);
        PersonWrapper personWrapper = new PersonWrapper();
        personWrapper.setPersonList(personList);
        File filePersons = new File("E:/xmlDocument/personList.xml");
        parser.staffToXML(filePersons, personWrapper);

        //Создаем документы и кидаем их в documentList.xml
        DocumentFactory documentFactory = new DocumentFactory();
        List<Document> documentList = new ArrayList<Document>();
        documentList.addAll(documentFactory.getDocumentList(TASK, 5));
        documentList.addAll(documentFactory.getDocumentList(INCOMING, 5));
        documentList.addAll(documentFactory.getDocumentList(OUTGOING, 5));
        DocumentWrapper documentWrapper = new DocumentWrapper();
        documentWrapper.setDocumentList(documentList);
        /*System.out.println(documentWrapper.getDocumentList().get(0).toString());
        System.out.println(documentWrapper.getDocumentList().get(6).toString());
        System.out.println(documentWrapper.getDocumentList().get(13).toString());
*/
        File fileDocuments = new File("E:/xmlDocument/documentList.xml");
        parser.staffToXML(fileDocuments, documentWrapper);

        Report rep = new Report();
        rep.getReport();

    }
}
