package com.etorrus.model.document;

import com.etorrus.model.staff.Person;

import java.util.Date;
import java.util.UUID;

public abstract class Document implements Comparable<Document>, Storable {

    //идентификатор документа
    private UUID id;
    //название документа
    private String name;
    //текст документа
    private String text;
    //регистрационный номер документа
    private int regNumCount;
    private String regNum;
    //дата регистрации документа
    private Date regDate;
    //автор документа
    private Person author;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String reg_num){

        this.regNum = reg_num;
    }

    public int getRegNumCount() {
        return regNumCount;
    }

    public void setRegNumCount(int regNumCount) {
        this.regNumCount = regNumCount;
    }

    public Date getDateReg() {
        return regDate;
    }

    public void setDateReg(Date dateReg) {
        this.regDate = dateReg;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public int compareTo(Document compareDoc) {
        return  this.regNum.compareTo(regNum);
    }
    @Override
    public String toString() {
        return "========== Документ =========={" + "\n" +
                "идентификатор= " + id + '\''+ "\n" +
                "имя= " + name + '\''+ "\n" +
                "текст= " + text + '\'' + "\n" +
                "рег-номер= " + regNum + '\'' + "\n" +
                "дата регистрации= " + regDate + '\''+ "\n" +
                "автор= " + author + '\''+ "\n" +
                '}';
    }

}
