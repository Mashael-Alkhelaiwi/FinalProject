package org.example.dto;


public class ConsultationDTO {


    private int consultId;
    private LocalDateTime requestTime;
    private LocalDateTime consultationTime;
    private String status;
    private String rateDoctor;

    public ConsultationDTO(int consultId, LocalDateTime requestTime, LocalDateTime consultationTime, String status, String rateDoctor) {
        this.consultId = consultId;
        this.requestTime = requestTime;
        this.consultationTime = consultationTime;
        this.status = status;
        this.rateDoctor = rateDoctor;
    }

    public void setConsultId(int consultId) {

        this.consultId = consultId;
    }

    public void setRequestTime(LocalDateTime requestTime) {

        this.requestTime = requestTime;
    }

    public void setConsultationTime(LocalDateTime consultationTime) {

        this.consultationTime = consultationTime;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void setRateDoctor(String rateDoctor) {

        this.rateDoctor = rateDoctor;
    }

    public int getConsultId() {

        return consultId;
    }

    public LocalDateTime getRequestTime() {

        return requestTime;
    }

    public LocalDateTime getConsultationTime() {

        return consultationTime;
    }

    public String getStatus() {

        return status;
    }

    public String getRateDoctor() {

        return rateDoctor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ConsultationDTO{" +
                "consultId=" + consultId +
                ", requestTime=" + requestTime +
                ", consultationTime=" + consultationTime +
                ", status='" + status + '\'' +
                ", rateDoctor='" + rateDoctor + '\'' +
                '}';
    }

}
