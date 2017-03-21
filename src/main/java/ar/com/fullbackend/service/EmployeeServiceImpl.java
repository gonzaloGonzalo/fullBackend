package ar.com.fullbackend.service;

import ar.com.fullbackend.dao.impl.EmployeeDAO;
import ar.com.fullbackend.dto.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by computer on 20/03/17.
 */
@Path("/employee")
public class EmployeeServiceImpl{

    @GET
    @Path("/employees")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getEmployees(){

        return Response.ok(EmployeeDAO.read()).build();
    }

    @GET
    @Path("/status")
    public String getStatus(){
        return "App is alive";
    }}
