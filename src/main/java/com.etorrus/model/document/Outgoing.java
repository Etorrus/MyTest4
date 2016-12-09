package com.etorrus.model.document;

import com.etorrus.model.staff.Person;

public class Outgoing extends Document {

    //адресат
    private Person adresse;
    //способ доставки
    private String deliveryMethod;

    public Person getAdresse() {
        return adresse;
    }

    public void setAdresse(Person adresse) {
        this.adresse = adresse;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Исходящий документ{" + "\n" +
                "адресат=" + adresse + "\n" +
                ", способ доставки=" + deliveryMethod + '\'' + "\n" +
                '}';
    }

    public void save() throws Exception {

    }
}
