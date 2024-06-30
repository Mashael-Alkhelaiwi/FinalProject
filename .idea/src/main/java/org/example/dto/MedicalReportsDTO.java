package org.example.dto;

import java.time.LocalDateTime;

public class MedicalReportDTO {
    private int id;
    private int patientId;
    private String details;
    private LocalDateTime reportDate;
    private int ratingId;


    public MedicalReportDTO() {
    }


    public MedicalReportDTO(int id, int patientId, String details, LocalDateTime reportDate, int ratingId) {
        this.id = id;
        this.patientId = patientId;
        this.details = details;
        this.reportDate = reportDate;
        this.ratingId = ratingId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "MedicalReportDTO{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", details='" + details + '\'' +
                ", reportDate=" + reportDate +
                ", ratingId=" + ratingId +
                '}';
    }
}
