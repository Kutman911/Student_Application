package com.example.applicationForm.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    @NonNull
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}