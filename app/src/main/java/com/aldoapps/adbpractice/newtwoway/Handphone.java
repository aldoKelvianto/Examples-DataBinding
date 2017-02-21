package com.aldoapps.adbpractice.newtwoway;

import com.android.databinding.library.baseAdapters.BR;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

/**
 * Created by aldo on 2/21/17.
 */

public class Handphone implements Observable {

    private PropertyChangeRegistry registry = new PropertyChangeRegistry();

    private String name;

    private String brand;

    public Handphone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        registry.notifyChange(this, BR.name);
    }

    @Bindable
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        registry.notifyChange(this, BR.brand);
    }

    @Override
    public void addOnPropertyChangedCallback(
        OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.add(onPropertyChangedCallback);
    }

    @Override
    public void removeOnPropertyChangedCallback(
        OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.remove(onPropertyChangedCallback);
    }
}
