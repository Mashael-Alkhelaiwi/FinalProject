package org.example.dto;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;

public class PatientDTO {
    private int patientId;
    private String name;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;


    public PatientDTO() {
    }

    public PatientDTO(int patientId, String name, String email, String phone, LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
