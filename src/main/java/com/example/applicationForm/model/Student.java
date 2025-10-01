package com.example.applicationForm.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    @NonNull
    private String email;
    private int age;
}
