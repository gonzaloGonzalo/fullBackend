package ar.com.fullbackend.service;

import ar.com.fullbackend.dto.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by computer on 20/03/17.
 */
@Path("/employee")
public interface EmployeeService {

    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployees();
}
