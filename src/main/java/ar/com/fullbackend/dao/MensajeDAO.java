package ar.com.fullbackend.dao;

import ar.com.fullbackend.model.Mensaje;
import java.util.Date;
import java.util.List;

public interface MensajeDAO {

    List<Mensaje> getMensajes();
    Mensaje getMensajePorFecha(Date fecha);
    Mensaje getUltimoMensaje();
    void ingresarMensaje(Mensaje mensaje);
}
