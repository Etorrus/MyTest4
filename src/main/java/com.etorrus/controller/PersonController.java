package com.etorrus.controller;

import com.etorrus.model.document.Document;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.DocumentWrapper;
import com.etorrus.wrapper.DocumentWrapperManager;
import com.etorrus.wrapper.PersonWrapperManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 */
@Path(value="/employees")
public class PersonController {

    PersonWrapperManager personList = new PersonWrapperManager();
    DocumentWrapperManager documentList = new DocumentWrapperManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons(){
        return personList.getPersonList();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public DocumentWrapper getAuthorByIdDocuments(@PathParam("id") UUID id) {
        List<Document> documentListById = new ArrayList<>();
        for(Document document : documentList.getDocumentList()){
            if(document.getAuthor().getId().equals(id)){
                documentListById.add(document);
            }
        }
        DocumentWrapper documentWrapper = new DocumentWrapper();
        documentWrapper.setDocumentList(documentListById);
        return documentWrapper;
    }



}
