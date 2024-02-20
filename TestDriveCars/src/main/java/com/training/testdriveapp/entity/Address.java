package com.training.testdriveapp.entity;

import com.training.testdriveapp.customer.Customer;
import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Integer Id;

    private String DoorNo;
    private String addressLane;
    private String City;
    private String State;
    private String pincode;
//   @OneToOne
//   @JoinColumn(name = "customerId")
//    private Customer customer;

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

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
