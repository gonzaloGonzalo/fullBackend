package ar.com.fullbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ALERTA")
public class Alerta {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "nivel_alerta")
    private String nivelAlerta;
    @Column(name = "precipitacion")
    private Long precipitacion;
    @Column(name = "temperatura")
    private Long temperatura;
    @Column(name = "fecha_alerta")
    private Date fechaAlerta;

    public int getId() {
        return id;
    }
    public void setId( int id ) {
        this.id = id;
    }
    public String getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(String nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }

    public Long getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(Long precipitacion) {
        this.precipitacion = precipitacion;
    }

    public Long getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Long temperatura) {
        this.temperatura = temperatura;
    }

    public Date getFechaAlerta() {
        return fechaAlerta;
    }

    public void setFechaAlerta(Date fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }
}
