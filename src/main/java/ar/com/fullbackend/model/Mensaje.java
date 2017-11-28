package ar.com.fullbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "MENSAJE")
public class Mensaje {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "fecha_mensaje")
    private Date fechaMensaje;
    @Column(name = "mensaje_descripcion")
    private String mensajeDescripcion;

    public Date getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(Date fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }

    public String getMensajeDescripcion() {
        return mensajeDescripcion;
    }

    public void setMensajeDescripcion(String mensajeDescripcion) {
        this.mensajeDescripcion = mensajeDescripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
