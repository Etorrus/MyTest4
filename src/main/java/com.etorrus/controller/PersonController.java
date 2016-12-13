package com.etorrus.controller;

import com.etorrus.model.staff.Person;
import com.etorrus.service.PersonService;
import com.etorrus.wrapper.PersonWrapper;
import com.etorrus.wrapper.PersonWrapperManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 */
@Path(value="/employees")
public class PersonController {

    PersonWrapperManager personWrapperManager = new PersonWrapperManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons()
    {

        List<Person> listOfPersons = personWrapperManager.getPersonList();
        return listOfPersons;
    }
}
