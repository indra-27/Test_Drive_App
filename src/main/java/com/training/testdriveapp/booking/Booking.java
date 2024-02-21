package com.training.testdriveapp.booking;

import com.training.testdriveapp.admin.Car;
import com.training.testdriveapp.customer.Customer;
import com.training.testdriveapp.entity.Slot;
import com.training.testdriveapp.staff.Staff;
import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private Integer bookId;
    @OneToOne
    private Car testDriveCar;
    @OneToOne
    private Slot availability;
    @OneToOne
    private Staff staff;
    @OneToOne
    private Customer customer;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Car getTestDriveCar() {
        return testDriveCar;
    }

    public void setTestDriveCar(Car testDriveCars) {
        this.testDriveCar = testDriveCars;
    }

    public Slot getAvailability() {
        return availability;
    }

    public void setAvailability(Slot availability) {
        this.availability = availability;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Booking() {
    }

    public Booking(Car testDriveCars, Slot availability, Staff staff, Customer customer) {
        this.testDriveCar = testDriveCars;
        this.availability = availability;
        this.staff = staff;
        this.customer = customer;
    }
}
