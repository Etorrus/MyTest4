package com.etorrus.staffs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*Организация (Organization)
полное наименование;
краткое наименование;
руководитель;
контактные телефоны.
*/
@XmlRootElement
public class Organization extends Staff {
    //Полное наименование
    private String fullName;
    //Краткое наименование
    private String shortName;
    //Руководитель
    private Person head;
    //Контактные телефоны
    private String contactPhones;

    public String getFullName() {
        return fullName;
    }

    @XmlElement
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    @XmlElement
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Person getHead() {
        return head;
    }

    @XmlElement
    public void setHead(Person head) {
        this.head = head;
    }

    public String getContactPhones() {
        return contactPhones;
    }

    @XmlElement
    public void setContactPhones(String contactPhones) {
        this.contactPhones = contactPhones;
    }

    @Override
    public String toString() {
        return "Organization{" +
                ", fullName=" + fullName + '\'' +
                ", shortName=" + shortName + '\'' +
                ", head=" + head + '\'' +
                ", contactPhones=" + contactPhones +
                '}';
    }

}
