package com.etorrus.factorys;


import com.etorrus.documents.Document;
import com.etorrus.documents.Task;
import com.etorrus.staffs.Person;
import com.etorrus.util.PersonWrapper;
import com.etorrus.util.JaxbParser;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskFactory extends DocumentFactory {

    public List<Task> getList(int count) {
        List<Task> result = new ArrayList<Task>();
        for (int i = 0; i < count; i++) {
            result.add(create(i));
        }
        return result;
    }

    public Task create(int i) {
        Task task = new Task();

        task.setId(Document.getCount());
        task.setName("Task_" + Document.getCount());
        task.setText("Text text");
        task.setRegNum("t-00" + Document.getCount() + i);
        task.setDateReg(new Date());

        final JaxbParser parser = new JaxbParser();
        final File file = new File("personList.xml");
        final PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);
        final List<Person> personList = personWraper.getPersonList();
        if (personList != null && !personList.isEmpty()) {
            Person author = personList.get(0);
            if (author != null) {
                task.setAuthor(author);
            }
            Person controller = personList.get(2);
            if (controller != null){
                task.setController(controller);
            }
            Person executer = personList.get(3);
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
