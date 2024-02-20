package com.training.testdriveapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Slot {

    @Id
    private Integer slot;
    private LocalDate date;


    public Slot(Integer slot, LocalDate date) {
        this.slot = slot;
        this.date = date;

    }

    public Slot() {

    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
