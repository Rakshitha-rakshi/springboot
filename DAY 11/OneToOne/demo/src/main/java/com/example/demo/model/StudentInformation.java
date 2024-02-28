package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class StudentInformation {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int id;
    private String address;
    private String  ph;
    private String city;
}