package org.example.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.UriInfo;
import org.example.dao.PatientDAO;
import org.example.dto.PatientDTO;
import org.example.models.Patient;

import java.net.URI;
import java.util.ArrayList;

@Path("/patients")
public class PatientController {
    private PatientDAO dao = new PatientDAO();
    private UriInfo uriInfo;

    public PatientController() {
    }

    @GET
    public ArrayList<Patient> getAllPatients() {
        try {
            return dao.getAllPatients();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("/{patientId}")
    public Patient getPatientById(@PathParam("patientId") int patientId) {
        try {
            return dao.getPatientById(patientId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    public void addPatient(Patient patient) {
        try {
            dao.addPatient(patient);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("/{patientId}")
    public void updatePatient(@PathParam("patientId") int patientId, Patient patient) {
        try {
            patient.setPatientId(patientId); // Set the patientId from path parameter
            dao.updatePatient(patient);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("/{patientId}")
    public void deletePatient(@PathParam("patientId") int patientId) {
        try {
            dao.deletePatient(patientId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
