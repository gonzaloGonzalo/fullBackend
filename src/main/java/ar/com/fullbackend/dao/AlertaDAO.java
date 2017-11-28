package ar.com.fullbackend.dao;

import ar.com.fullbackend.model.Alerta;

import java.util.Date;
import java.util.List;

public interface AlertaDAO {

    List<Alerta> getAlertas();
    Alerta getAlertaPorFecha(Date fecha);
    Alerta getAlertaReciente();
    void ingresarAlerta(Alerta alerta);
}
