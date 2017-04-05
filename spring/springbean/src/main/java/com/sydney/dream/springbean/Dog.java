package com.sydney.dream.springbean;

/**
 * Created by Sydney on 2017/4/2.
 */
public class Dog {
    private int id;
    private int size;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public Dog(int id, int size) {
        this.id = id;
        this.size = size;
    }

    public Dog(int id, int size, String name) {
        this.id = id;
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
