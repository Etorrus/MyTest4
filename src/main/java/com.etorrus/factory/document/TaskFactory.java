package com.etorrus.factory.document;


import com.etorrus.model.document.Document;
import com.etorrus.model.document.Task;
import com.etorrus.model.staff.Person;
import com.etorrus.wrapper.PersonWrapperManager;

import java.util.*;

public class TaskFactory extends DocumentFactory {

    public List<Document> getList(int count) {
        List<Document> result = new ArrayList<Document>();
        for (int i = 0; i < count; i++) {
            result.add(create(i));
        }
        return result;
    }

    public Task create(int i) {
        Task task = new Task();

        task.setId(UUID.randomUUID());
        task.setName("Task_");
        task.setText("Text text");
        task.setRegNum("t-00" + task.getId());
        task.setDateReg(new Date());

        final List<Person> personList = PersonWrapperManager.getPersonList();
        if (personList != null && !personList.isEmpty()) {
            Collections.shuffle(personList);
            Person author = personList.get(0);
            if (author != null) {
                task.setAuthor(author);
            }
            Collections.shuffle(personList);
            Person controller = personList.get(0);
            if (controller != null){
                task.setController(controller);
            }
            Collections.shuffle(personList);
            Person executer = personList.get(0);
            if (executer != null){
                task.setExecutor(executer);
            }
        }
        task.setDateOfIssue(new Date());
        task.setPeriodOfExecution(5);
        task.setSignOfControl(false);
        System.out.println("Task" + i + " has been created");

        return task;
    }

}
