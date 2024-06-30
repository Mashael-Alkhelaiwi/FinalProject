package org.example.dto;

public class RatingDTO {
    private int id;
    private int patientId;
    private int doctorId;
    private int rating;

    public RatingDTO() {

    }

    public RatingDTO(int id, int patientId, int doctorId, int rating) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.rating = rating;
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

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "RatingDTO{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", rating=" + rating +
                '}';
    }
}
