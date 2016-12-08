package com.etorrus.staffs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/*@XmlAccessorType(XmlAccessType.FIELD)*/
@XmlRootElement
public class PersonWrapper {

    private List<Person> personList;

    public PersonWrapper() {
    }

    public List<Person> getPersonList() {
        return personList;
    }
    @XmlElement
    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
