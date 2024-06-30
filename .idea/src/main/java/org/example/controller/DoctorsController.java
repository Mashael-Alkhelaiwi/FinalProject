package org.example.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;
import jakarta.ws.rs.core.MediaType;
import org.example.dao.DoctorDAO;
import org.example.dto.DoctorDTO;
import org.example.models.Doctor;

import java.util.ArrayList;

@Path("/doctors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoctorsController {
    private DoctorDAO doctorDAO = new DoctorDAO();

    @GET
    public ArrayList<DoctorDTO> getAllDoctors() {
        try {
            return doctorDAO.getAllDoctors();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("/{doctorId}")
    public DoctorDTO getDoctorById(@PathParam("doctorId") int doctorId) {
        try {
            return doctorDAO.getDoctorById(doctorId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    public void addDoctor(DoctorDTO doctorDTO) {
        try {
            doctorDAO.addDoctor(doctorDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("/{doctorId}")
    public void updateDoctor(@PathParam("doctorId") int doctorId, DoctorDTO doctorDTO) {
        try {
            doctorDTO.setId(doctorId);
            doctorDAO.updateDoctor(doctorDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("/{doctorId}")
    public void deleteDoctor(@PathParam("doctorId") int doctorId) {
        try {
            doctorDAO.deleteDoctor(doctorId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
