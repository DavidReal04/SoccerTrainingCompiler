package com.unbosque.ast;

public class TagAttribute {
    
    private String name, value;

    public TagAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String toString(){
        return this.name + "=" + "'" + this.value + "'";
    }
  
}
