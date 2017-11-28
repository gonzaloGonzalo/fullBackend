package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dao.AlertaDAO;
import ar.com.fullbackend.model.Alerta;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import java.util.Date;
import java.util.List;

public class AlertaDAOImpl extends HibernateDataAccess implements AlertaDAO{

    private final static Logger LOGGER = Logger.getLogger(AlertaDAOImpl.class.getSimpleName());

    public List<Alerta> getAlertas(){
        Session session = getSessionFactory().openSession();
        List<Alerta> alertas = session.createCriteria(Alerta.class).list();
        session.close();
        LOGGER.info(new StringBuilder("Alertas encontradas: ").append(alertas.size()));
        return alertas;
    }

    public Alerta getAlertaPorFecha(Date fecha){
        Session session = getSessionFactory().openSession();
        Alerta alerta = (Alerta) session.load(Alerta.class, fecha);
        session.close();
        LOGGER.info("Alertas encontradas");
        return alerta;
    }

    public Alerta getAlertaReciente(){
        Session session = getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Alerta.class).addOrder(Order.desc("fechaAlerta"));
        criteria.setMaxResults(1);
        List<Alerta> listAlerta = criteria.list();
        session.close();
        LOGGER.info("Alertas encontradas");
        return listAlerta.get(0);
    }

    public void ingresarAlerta(Alerta alerta){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alerta);
        session.getTransaction().commit();
        LOGGER.info("Alertas ingresada correctamente");
        session.close();
    }
}
