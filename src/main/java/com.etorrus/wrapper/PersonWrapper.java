package com.etorrus.wrapper;

import com.etorrus.model.staff.Person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/*@XmlAccessorType(XmlAccessType.FIELD)*/
@XmlRootElement
public class PersonWrapper {

    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }
    @XmlElement
    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
