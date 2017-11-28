package ar.com.fullbackend.service;

import ar.com.fullbackend.dao.impl.AlertaDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/salvaguarda")
public class SalvaGuardaController {


    @GET
    @RequestMapping("/alerta")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getAlertaMasReciente(){
        return Response.ok(new AlertaDAOImpl().getAlertaReciente()).build();
    }

}
