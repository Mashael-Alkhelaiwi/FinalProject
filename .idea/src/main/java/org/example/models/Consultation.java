package org.example.models;
import java.time.LocalDateTime;

public class Consultation {
    private int consultId;
    private LocalDateTime requestTime;
    private LocalDateTime consultationTime;
    private String status;
    private String rateDoctor;


    public Consultation() {
    }

    public Consultation(int consultId, LocalDateTime requestTime, LocalDateTime consultationTime, String status, String rateDoctor) {
        this.consultId = consultId;
        this.requestTime = requestTime;
        this.consultationTime = consultationTime;
        this.status = status;
        this.rateDoctor = rateDoctor;
    }

    public int getConsultId() {
        return consultId;
    }

    public void setConsultId(int consultId) {
        this.consultId = consultId;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    public LocalDateTime getConsultationTime() {
        return consultationTime;
    }

    public void setConsultationTime(LocalDateTime consultationTime) {
        this.consultationTime = consultationTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRateDoctor() {
        return rateDoctor;
    }

    public void setRateDoctor(String rateDoctor) {
        this.rateDoctor = rateDoctor;
    }


    @Override
    public String toString() {
        return "Consultation{" +
                "consultId=" + consultId +
                ", requestTime=" + requestTime +
                ", consultationTime=" + consultationTime +
                ", status='" + status + '\'' +
                ", rateDoctor='" + rateDoctor + '\'' +
                '}';
    }
}
