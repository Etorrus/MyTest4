package com.etorrus.factory.document;


import com.etorrus.model.document.Task;
import com.etorrus.model.staff.Person;
import com.etorrus.service.PersonService;

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

        task.setId(1 + (int)Math.random() *100);
        task.setName("Task_" + task.getId());
        task.setText("Text text");
        task.setRegNum("t-00" + task.getId() + i);
        task.setDateReg(new Date());

        /*final JaxbParser parser = new JaxbParser();
        final File file = new File("E:/xmlDocument/personList.xml");
        final PersonWrapper personWraper = (PersonWrapper) parser.XMLToStaff(file, PersonWrapper.class);*/
        final List<Person> personList = PersonService.getPersonList();
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
