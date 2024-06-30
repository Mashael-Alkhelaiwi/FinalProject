package org.example.dto;
import java.time.LocalDateTime;

public class ScheduleDTO {
    private int id;
    private int doctorId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isAvailable;


    public ScheduleDTO() {
    }


    public ScheduleDTO(int id, int doctorId, LocalDateTime startTime, LocalDateTime endTime, boolean isAvailable) {
        this.id = id;
        this.doctorId = doctorId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isAvailable = isAvailable;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ScheduleDTO{" +
                "id=" + id +
                ", doctorId=" + doctorId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
