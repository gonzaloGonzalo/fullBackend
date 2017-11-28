package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dao.AlertaDAO;
import ar.com.fullbackend.dao.MensajeDAO;
import ar.com.fullbackend.model.Alerta;
import ar.com.fullbackend.model.Mensaje;

import java.util.Calendar;


/**
 * Created by computer on 20/03/17.
 */
public class TestEmployee {

    public static void main(String args[]){

        Alerta alerta = new Alerta();
        alerta.setNivelAlerta("Verde");
        alerta.setTemperatura(10L);
        alerta.setPrecipitacion(1000L);
        AlertaDAO alertaDAO = new AlertaDAOImpl();
        MensajeDAO mensajeDAO = new MensajeDAOImpl();

        Calendar cal;

        for(int i=0; i<5; i++){
            cal = Calendar.getInstance();
            Mensaje mensaje = new Mensaje();
            mensaje.setFechaMensaje(cal.getTime());
            mensaje.setMensajeDescripcion("Mensaje: "+i);
            mensajeDAO.ingresarMensaje(mensaje);
            alerta.setFechaAlerta(cal.getTime());
            alerta.setTemperatura(alerta.getTemperatura()+i);
            alerta.setPrecipitacion(alerta.getPrecipitacion()+i);
            if(i == 3){
                alerta.setNivelAlerta("Amarillo");
            }
            if(i == 4){
                alerta.setNivelAlerta("Rojo");
                alerta.setPrecipitacion(2000L);
            }
            alertaDAO.ingresarAlerta(alerta);
        }

    }
}
