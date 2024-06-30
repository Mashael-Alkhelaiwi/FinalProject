package org.example.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.dao.ConsultationDAO;
import org.example.models.Consultation;

import java.util.ArrayList;

public class ConsultationService {
    private ConsultationDAO dao = new ConsultationDAO();

    public ArrayList<Consultation> getAllConsultations() {
        try {
            return dao.getAllConsultations();
        } catch (Exception e) {
            throw new RuntimeException("Error while fetching all consultations", e);
        }
    }

    public Consultation getConsultationById(int consultId) {
        try {
            return dao.getConsultationById(consultId);
        } catch (Exception e) {
            throw new RuntimeException("Error while fetching consultation with ID: " + consultId, e);
        }
    }

    public void addConsultation(Consultation consultation) {
        try {
            dao.addConsultation(consultation);
        } catch (Exception e) {
            throw new RuntimeException("Error while adding new consultation", e);
        }
    }

    public void updateConsultation(Consultation consultation) {
        try {
            dao.updateConsultation(consultation);
        } catch (Exception e) {
            throw new RuntimeException("Error while updating consultation with ID: " + consultation.getConsultId(), e);
        }
    }

    public void deleteConsultation(int consultId) {
        try {
            dao.deleteConsultation(consultId);
        } catch (Exception e) {
            throw new RuntimeException("Error while deleting consultation with ID: " + consultId, e);
        }
    }
}
