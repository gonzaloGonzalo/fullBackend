package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dao.AlertaDAO;
import ar.com.fullbackend.model.Alerta;

import java.util.Calendar;


/**
 * Created by computer on 20/03/17.
 */
public class TestEmployee {

    public static void main(String args[]){

        AlertaDAO alertaDAO = new AlertaDAOImpl();
        Calendar cal = Calendar.getInstance();

        Alerta alerta = new Alerta();
        alerta.setNivelAlerta("Rojo");
        alerta.setTemperatura(18L);
        alerta.setPrecipitacion(180L);
        alerta.setFechaAlerta(cal.getTime());
        alertaDAO.ingresarAlerta(alerta);
        }
}
