package com.training.testdriveapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private String DoorNo;
    private String addressLane;
    private String City;
    private String State;
    private String pincode;

    public String getDoorNo() {
        return DoorNo;
    }

    public void setDoorNo(String doorNo) {
        DoorNo = doorNo;
    }

    public String getAddressLane() {
        return addressLane;
    }

    public void setAddressLane(String addressLane) {
        this.addressLane = addressLane;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Address() {
    }

    public Address(String doorNo, String addressLane, String city, String state, String pincode) {
        DoorNo = doorNo;
        this.addressLane = addressLane;
        City = city;
        State = state;
        this.pincode = pincode;
    }
}
