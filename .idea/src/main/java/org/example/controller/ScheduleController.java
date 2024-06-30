package org.example.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;
import jakarta.ws.rs.core.MediaType;
import org.example.dao.ScheduleDAO;
import org.example.dto.ScheduleDTO;

import java.util.ArrayList;

@Path("/schedules")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ScheduleController {
    private ScheduleDAO scheduleDAO = new ScheduleDAO();

    @GET
    public ArrayList<ScheduleDTO> getAllSchedules() {
        try {
            return scheduleDAO.getAllSchedules();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GET
    @Path("/{scheduleId}")
    public ScheduleDTO getScheduleById(@PathParam("scheduleId") int scheduleId) {
        try {
            return scheduleDAO.getScheduleById(scheduleId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    public void addSchedule(ScheduleDTO scheduleDTO) {
        try {
            scheduleDAO.addSchedule(scheduleDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("/{scheduleId}")
    public void updateSchedule(@PathParam("scheduleId") int scheduleId, ScheduleDTO scheduleDTO) {
        try {
            scheduleDTO.setId(scheduleId);
            scheduleDAO.updateSchedule(scheduleDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("/{scheduleId}")
    public void deleteSchedule(@PathParam("scheduleId") int scheduleId) {
        try {
            scheduleDAO.deleteSchedule(scheduleId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
