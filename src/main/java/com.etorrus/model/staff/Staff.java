package com.etorrus.model.staff;

import java.util.UUID;

public abstract class Staff {
    //Идентификатор
    private UUID id;

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }
}
