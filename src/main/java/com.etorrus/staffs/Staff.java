package com.etorrus.staffs;

public abstract class Staff {
    private static int staffCount;
    //Идентификатор
    private int id = staffCount++;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}
