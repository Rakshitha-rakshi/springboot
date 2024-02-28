package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Children{
    @Id
    private int babyId;
    private String babyFirstname;
    private String babyLastname;
    private String fathername;
    private String mothername;
    private String address;
    public Children()
    {

    }
    public Children(int babyId, String babyFirstname, String babyLastname, String fathername, String mothername,
            String address) {
        this.babyId = babyId;
        this.babyFirstname = babyFirstname;
        this.babyLastname = babyLastname;
        this.fathername = fathername;
        this.mothername = mothername;
        this.address = address;
    }
    public int getBaby() {
        return babyId;
    }
    public void setBaby(int babyId) {
        this.babyId = babyId;
    }
    public String getBabyFirstname() {
        return babyFirstname;
    }
    public void setBabyFirstname(String babyFirstname) {
        this.babyFirstname = babyFirstname;
    }
    public String getBabyLastname() {
        return babyLastname;
    }
    public void setBabyLastname(String babyLastname) {
        this.babyLastname = babyLastname;
    }
    public String getFathername() {
        return fathername;
    }
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }
    public String getMothername() {
        return mothername;
    }
    public void setMothername(String mothername) {
        this.mothername = mothername;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}