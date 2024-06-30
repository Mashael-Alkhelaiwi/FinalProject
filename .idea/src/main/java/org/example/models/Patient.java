package org.example.models;
import java.time.LocalDate;

public class Patient {
    private int patientId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private LocalDate dateOfBirth;


    public Patient() {
    }

    public Patient(int patientId, String name, String email, String password, String phone, LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
