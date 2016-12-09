package com.etorrus.documents;


import com.etorrus.staffs.Person;

import java.util.Date;

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

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getAdresse() {
        return adresse;
    }

    public void setAdresse(Person adresse) {
        this.adresse = adresse;
    }

    public int getOutgoingNum() {
        return outgoingNum;
    }

    public void setOutgoingNum(int outgoingNum) {
        this.outgoingNum = outgoingNum;
    }

    public Date getOutgoingRegDate() {
        return outgoingRegDate;
    }

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
