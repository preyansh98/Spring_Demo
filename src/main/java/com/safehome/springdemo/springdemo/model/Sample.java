package com.safehome.springdemo.springdemo.model;

//Everything in model, are your domain entities.
//These are POJOS - plain old java objects.
//No custom logic, just a data holder.
public class Sample {
    
    public String attributeOne;
    public boolean attributeTwo;

    public Sample(String attributeOne, boolean attributeTwo) {
        this.attributeOne = attributeOne;
        this.attributeTwo = attributeTwo;
    }

    public String getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public boolean isAttributeTwo() {
        return attributeTwo;
    }

    public void setAttributeTwo(boolean attributeTwo) {
        this.attributeTwo = attributeTwo;
    }
}
