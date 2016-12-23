package com.aldoapps.adbpractice.eventhandling;

import java.io.Serializable;

/**
 * Created by aldo on 12/23/16.
 * To demonstrate that you can use Bean instead of POJO
 */

public class HumanBean implements Serializable {
    private String name;

    public HumanBean(){}

    public HumanBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
