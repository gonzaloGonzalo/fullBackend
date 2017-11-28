package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dao.MensajeDAO;
import ar.com.fullbackend.model.Mensaje;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.util.Date;
import java.util.List;

public class MensajeDAOImpl extends HibernateDataAccess implements MensajeDAO{

    private final static Logger LOGGER = Logger.getLogger(MensajeDAOImpl.class.getSimpleName());

    public List<Mensaje> getMensajes(){
        Session session = getSessionFactory().openSession();
        List<Mensaje> mensajes = session.createQuery("FROM mensaje").list();
        session.close();
        LOGGER.info(new StringBuilder("Mensajes encontrados: ").append(mensajes.size()));
        return mensajes;
    }
    public Mensaje getMensajePorFecha(Date fecha){
        Session session = getSessionFactory().openSession();
        Mensaje mensaje = (Mensaje) session.load(Mensaje.class, fecha);
        session.close();
        LOGGER.info("Mensaje encontrados");
        return mensaje;
    }
    public void ingresarMensaje(Mensaje mensaje){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(mensaje);
        session.getTransaction().commit();
        LOGGER.info("Mensaje ingresado correctamente");
        session.close();
    }
}
