package com.etorrus.model.document;


import com.etorrus.model.staff.Person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Incoming extends Document {

    //отправитель

    private Person sender;
    //адресат

    private Person adresse;
    //исходящий номер
    private int outgoingNum;
    //исходящая дата регистрации
    private Date outgoingRegDate;


    public Person getSender() {
        return sender;
    }
    @XmlElement
    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getAdresse() {
        return adresse;
    }
    @XmlElement
    public void setAdresse(Person adresse) {
        this.adresse = adresse;
    }

    public int getOutgoingNum() {
        return outgoingNum;
    }
    @XmlElement
    public void setOutgoingNum(int outgoingNum) {
        this.outgoingNum = outgoingNum;
    }

    public Date getOutgoingRegDate() {
        return outgoingRegDate;
    }
    @XmlElement
    public void setOutgoingRegDate(Date outgoingRegDate) {
        this.outgoingRegDate = outgoingRegDate;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Входящий документ{" + "\n" +
                "отправитель=" + sender + "\n" +
                "адресат=" + adresse + '\'' + "\n" +
                "исходящий номер=" + outgoingNum + '\'' + "\n" +
                "исходящая дата регистрации=" + outgoingRegDate +
                '}';
    }
}
