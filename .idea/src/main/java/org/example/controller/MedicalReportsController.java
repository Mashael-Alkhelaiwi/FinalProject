package org.example.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;
import jakarta.ws.rs.core.MediaType;
import org.example.dao.MedicalReportDAO;
import org.example.dto.MedicalReportDTO;

import java.util.ArrayList;

@Path("/medical-reports")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedicalReportsController {
    private MedicalReportDAO medicalReportDAO = new MedicalReportDAO();

    @GET
    public ArrayList<MedicalReportDTO> getAllMedicalReports() {
        try {
            return medicalReportDAO.getAllMedicalReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("/{reportId}")
    public MedicalReportDTO getMedicalReportById(@PathParam("reportId") int reportId) {
        try {
            return medicalReportDAO.getMedicalReportById(reportId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    public void addMedicalReport(MedicalReportDTO medicalReportDTO) {
        try {
            medicalReportDAO.addMedicalReport(medicalReportDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("/{reportId}")
    public void updateMedicalReport(@PathParam("reportId") int reportId, MedicalReportDTO medicalReportDTO) {
        try {
            medicalReportDTO.setId(reportId);
            medicalReportDAO.updateMedicalReport(medicalReportDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("/{reportId}")
    public void deleteMedicalReport(@PathParam("reportId") int reportId) {
        try {
            medicalReportDAO.deleteMedicalReport(reportId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
