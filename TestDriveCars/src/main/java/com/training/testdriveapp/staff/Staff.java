package com.training.testdriveapp.staff;

import com.training.testdriveapp.entity.Address;
import com.training.testdriveapp.entity.Slot;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Staff {
    @Id
    @GeneratedValue
    private Integer staffId;
    private String staffName;
    @OneToOne
    private Address address;
    private String phoneNumber;
    private String staffEmail;
    @ManyToMany
    private List<Slot> staffAvailabilityList;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public List<Slot> getStaffAvailabilityList() {
        return staffAvailabilityList;
    }

    public void setStaffAvailabilityList(List<Slot> staffAvailabilityList) {
        this.staffAvailabilityList = staffAvailabilityList;
    }

    public Staff() {
    }

    public Staff(String staffName, Address address, String phoneNumber, String staffEmail, List<Slot> staffAvailabilityList) {
        this.staffName = staffName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.staffEmail = staffEmail;
        this.staffAvailabilityList = staffAvailabilityList;
    }
}
