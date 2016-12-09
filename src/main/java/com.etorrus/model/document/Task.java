package com.etorrus.model.document;

import com.etorrus.model.staff.Person;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement
public class Task extends Document {
    //дата выдачи поручения
    private Date dateOfIssue;
    //срок исполнения поручения
    private long periodOfExecution;
    //ответственный исполнитель
    private Person executor;
    //признак контрольности
    private boolean signOfControl;
    //контролер поручения
    private Person controller;

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public long getPeriodOfExecution() {
        return periodOfExecution;
    }

    public void setPeriodOfExecution(long periodOfExecution) {
        this.periodOfExecution = periodOfExecution;
    }

    public Person getExecutor() {
        return executor;
    }

    public void setExecutor(Person executor) {
        this.executor = executor;
    }

    public Boolean getSignOfControl() {
        return signOfControl;
    }

    public void setSignOfControl(Boolean signOfControl) {
        this.signOfControl = signOfControl;
    }

    public Person getController() {
        return controller;
    }

    public void setController(Person controller) {
        this.controller = controller;
    }

    @Override
    public String toString() {

        return super.toString() + "\n" + "Поручение{" + "\n" +
                "Дата выдачи поручения= " + dateOfIssue + '\''+ "\n" +
                "Срок исполнения поручения= " + periodOfExecution + '\''+ "\n" +
                "Ответственный исполнитель= " + executor + '\'' + "\n" +
                "Признак контрольности= " + signOfControl + '\'' + "\n" +
                "Контролер поручения= " + controller + '\''+
                '}';
    }

    /*public String getTable() {
        return null;
    }*/
}
