package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date valueDate;

    public Mood(Date valueDate){
        this.valueDate = valueDate;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public abstract String currentMood();
}
