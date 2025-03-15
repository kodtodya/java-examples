package com.kodtodya.model;


public class Address {

    private int addressId;
    private String city;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {
    }

    public Address(int addressId, String city) {
        this.addressId = addressId;
        this.city = city;
    }
}
