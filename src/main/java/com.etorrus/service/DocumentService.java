package com.etorrus.service;

import com.etorrus.model.document.Document;
import com.etorrus.exceptions.DocumentExistException;


public class DocumentService {

    /*public DocumentService() {
    }

    public void doRegistration(Document d) throws DocumentExistException {
        *//**Пока здесь наколхозил
         * нужно реализовать нормальное присваивание регистрационного
         * номера документу с проверкой рег номеров уже созданных доков*//*
        int regNumCount = (int) (1 + Math.random() * 20);
        d.setRegNumCount(regNumCount);
        d.setRegNum("D-0000" + regNumCount);
    }

    *//**
     * Проверяет при генерации регистрационного номера, что
     * дукумент с таким номером еще не был сгенерирован
     * @param regNum
     * @throws DocumentExistException
     *//*
    public void checkRegNum(String regNum) throws DocumentExistException {

    }*/
}
