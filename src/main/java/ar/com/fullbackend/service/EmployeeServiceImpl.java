package ar.com.fullbackend.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.fullbackend.dao.impl.EmployeeDAO;
import ar.com.fullbackend.dto.Employee;

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
    @Path("/single/{employeeId: [0-9]}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response obtainEmployee(@PathParam("employeeId") Integer employeeId) {
        Employee employee = new Employee();
        try {
            return Response.ok(employee).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/status")
    public String getStatus(){
        return "App is alive";
    }
}
