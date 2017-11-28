package ar.com.fullbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UBICACION")
public class Ubicacion {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "fecha_ubicacion")
    private String fechaUbicacion;
    @Column(name = "latitud")
    private String latitud;
    @Column(name = "longitud")
    private String longitud;

    public String getFechaUbicacion() {
        return fechaUbicacion;
    }

    public void setFechaUbicacion(String fechaUbicacion) {
        this.fechaUbicacion = fechaUbicacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
