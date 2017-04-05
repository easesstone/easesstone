package com.sydney.dream.springbean;

import java.util.List;
import java.util.Map;

/**
 * Created by Sydney on 2017/4/2.
 */
public class Person {
    private int age;
    private String name;
    private Dog dog;
    private List<Car> cars;
    private Map<String,Room> rooms;

    public Map<String, Room> getRooms() {
        return rooms;
    }

    public void setRooms(Map<String, Room> rooms) {
        this.rooms = rooms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Person() {
    }


    public Person(int age, String name, Dog dog) {
        this.age = age;
        this.name = name;
        this.dog = dog;
    }

    public Person(int age, String name, Dog dog, List<Car> cars) {
        this.age = age;
        this.name = name;
        this.dog = dog;
        this.cars = cars;
    }

    public Person(int age, String name, Dog dog, List<Car> cars, Map<String, Room> rooms) {
        this.age = age;
        this.name = name;
        this.dog = dog;
        this.cars = cars;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                ", cars=" + cars +
                ", rooms=" + rooms +
                '}';
    }
}
