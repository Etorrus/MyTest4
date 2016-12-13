package com.etorrus.factory.staff;


import com.etorrus.model.staff.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class PersonFactory extends StaffFactory {

    public List<Person> getList(int count){
        List<Person> result = new ArrayList<Person>();
        for(int i = 0; i< count; i++){
            result.add(create());
            System.out.println("Person" + i + " has been created");
        }
        return result;
    }


    public Person create() {

        List<String> names = new ArrayList<String>();
        names.add("Иван");
        names.add("Петр");
        names.add("Михаил");
        names.add("Семен");
        names.add("Александр");
        names.add("Филип");
        names.add("Владимир");
        names.add("Галактион");
        names.add("Степан");
        names.add("Борис");


        Person person = new Person();
        person.setId(UUID.randomUUID());
        Collections.shuffle(names);
        person.setLastName(names.get(0) + "ов");
        Collections.shuffle(names);
        person.setFirstName(names.get(1));
        Collections.shuffle(names);
        person.setPatronymic(names.get(2) + "ович");
        person.setPosition("Сотрудник");

        return person;
    }
}
