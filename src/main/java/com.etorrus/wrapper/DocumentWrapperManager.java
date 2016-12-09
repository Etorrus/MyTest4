package com.etorrus.wrapper;

import com.etorrus.dao.JaxbParser;
import com.etorrus.model.document.Document;

import java.io.File;
import java.util.List;

/**
 * Вытаскивает из xml documentList
 */
public class DocumentWrapperManager {
    public static List<Document> getDocumentList(){
        JaxbParser parser = new JaxbParser();
        File file = new File("E:/xmlDocument/documentList.xml");
        DocumentWrapper documentWrapper = (DocumentWrapper) parser.XMLToStaff(file, DocumentWrapper.class);
        List<Document> documentList = documentWrapper.getDocumentList();
        return documentList;

    }
}
