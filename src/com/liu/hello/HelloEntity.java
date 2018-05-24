package com.liu.hello;

public class HelloEntity {
    private String name;
    private int id;
    private int meth;
    public HelloEntity(){

    }
    public HelloEntity(String name, int id, int meth) {
        this.name = name;
        this.id = id;
        this.meth = meth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMeth() {
        return meth;
    }

    public void setMeth(int meth) {
        this.meth = meth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:'" + name +
                ", id:" + id +
                ", meth:'";
    }
}
