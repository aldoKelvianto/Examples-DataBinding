package com.aldoapps.adbpractice.twoway;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.aldoapps.adbpractice.BR;

/**
 * Created by aldo on 1/6/17.
 */

public class Human extends BaseObservable {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Human(){}

    public Human(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
