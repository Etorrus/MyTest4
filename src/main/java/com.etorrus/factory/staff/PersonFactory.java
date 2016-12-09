package com.etorrus.factory.staff;


import com.etorrus.model.staff.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonFactory extends StaffFactory {

    public List<Person> getList(int count){
        List<Person> result = new ArrayList<Person>();
        for(int i = 0; i< count; i++){
            result.add(create(i));
            System.out.println("Person" + i + " has been created");
        }
        return result;
    }
    public Person create(int i) {
        super.create();
        Person person = new Person();
        person.setLastName("Иванов" + i);
        person.setFirstName("Иван" + i);
        person.setPatronymic("Иванович" + i);
        person.setPosition("Сотрудник" + i);
        return person;
    }
}
