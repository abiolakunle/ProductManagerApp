package com.abiolasoft.productmanagerapp.viewmodels;

import java.util.List;

public class Property {

    private int id;
    private String name;
    private List<PropertyValue> propertyValues;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPropertyValue(PropertyValue newPropertyValue) {
        propertyValues.add(newPropertyValue);
    }

    public void removePropertyValue(int index) {
        propertyValues.remove(index);
    }
}
