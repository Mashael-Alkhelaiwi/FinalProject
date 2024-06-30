package org.example.controller;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.UriInfo;
import org.example.dao.ConsultationDAO;
import org.example.dto.ConsultationDTO;
import org.example.models.Consultation;

import java.net.URI;
import java.util.ArrayList;

@Path("/consultations")
public class ConsultationController {
    private ConsultationDAO dao = new ConsultationDAO();
    private UriInfo uriInfo;

    public ConsultationController() {
    }

    @GET
    public ArrayList<Consultation> getAllConsultations() {
        try {
            return dao.getAllConsultations();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("/{consultId}")
    public Consultation getConsultationById(@PathParam("consultId") int consultId) {
        try {
            return dao.getConsultationById(consultId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    public void addConsultation(Consultation consultation) {
        try {
            dao.addConsultation(consultation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("/{consultId}")
    public void updateConsultation(@PathParam("consultId") int consultId, Consultation consultation) {
        try {
            consultation.setConsultId(consultId); // Set the consultId from path parameter
            dao.updateConsultation(consultation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("/{consultId}")
    public void deleteConsultation(@PathParam("consultId") int consultId) {
        try {
            dao.deleteConsultation(consultId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}