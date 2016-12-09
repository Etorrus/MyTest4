package com.etorrus.model.staff;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


// определяем корневой элемент
//@XmlRootElement
public class Person extends Staff {
    //Фамилия
    private String lastName;
    //Имя
    private String firstName;
    //Отчество
    private String patronymic;
    //Должность
    private String position;

    public Person(){

    }

    public String getLastName() {
        return lastName;
    }

    //@XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    //@XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    //@XmlElement
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    //@XmlElement
    public void setPosition(String position) {
        this.position = position;
    }



    @Override
    public String toString() {
        return "Person{" +
                ", lastName=" + lastName + '\'' +
                ", firstName=" + firstName + '\'' +
                ", patronymic=" + patronymic + '\'' +
                ", position=" + position +
                '}';
    }


    public int compareTo(Person author) {
        return this.lastName.compareTo(author.lastName);
    }

}

