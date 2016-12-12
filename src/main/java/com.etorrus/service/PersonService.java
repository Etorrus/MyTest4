package com.etorrus.service;

import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.PersonWrapper;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 */
@Path(value="/ecm/employees")
public class PersonService {

    @Produces({"application/json"})
    @GET
    public List<Person> getPersons(){
        PersonWrapper personWrapper = new PersonWrapper();
        return personWrapper.getPersonList();
    }

}
