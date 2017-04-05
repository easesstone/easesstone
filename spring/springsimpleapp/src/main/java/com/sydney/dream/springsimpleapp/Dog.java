package com.sydney.dream.springsimpleapp;

/**
 * Created by Sydney on 2017/4/2.
 */
public class Dog {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.print("set the id : " + id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set the name : " + name);
        this.name = name;
    }

    public Dog(){
        System.out.println("dog's  constructor  is doing now.....");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
