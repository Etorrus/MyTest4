package com.etorrus.factorys;


import com.etorrus.documents.Task;

class TaskFactory extends DocumentFactory {

    public Task create() {
        Task task = new Task();




        return task;
    }

}
