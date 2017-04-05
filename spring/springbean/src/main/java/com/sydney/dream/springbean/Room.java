package com.sydney.dream.springbean;

/**
 * Created by Sydney on 2017/4/2.
 */
public class Room {
    private String city;
    private String price;

    public Room() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Room(String city, String price) {
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "city='" + city + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
