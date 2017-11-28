package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dao.UsuarioDAO;
import ar.com.fullbackend.model.Ubicacion;
import ar.com.fullbackend.model.Usuario;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.util.List;

public class UsuarioDAOImpl extends HibernateDataAccess implements UsuarioDAO{

    private final static Logger LOGGER = Logger.getLogger(UsuarioDAOImpl.class.getSimpleName());

    public List<Usuario> getUsuarios(){
        Session session = getSessionFactory().openSession();
        List<Usuario> mensajes = session.createQuery("FROM usuario").list();
        session.close();
        LOGGER.info(new StringBuilder("Usuarios encontrados: ").append(mensajes.size()));
        return mensajes;
    }
    public Usuario getUsuarioPorId(int id){
        Session session = getSessionFactory().openSession();
        Usuario usuario = (Usuario) session.load(Usuario.class, id);
        session.close();
        LOGGER.info("Usuario encontrado");
        return usuario;
    }
    public void ingreasarUsuario(Usuario usuario){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        LOGGER.info("Usuario ingresado correctamente");
        session.close();
    }
    public void actualizarUsuario(Usuario usuario){

    }
    public void eliminarUsuario(Usuario usuario){

    }
    public void actualizarUltimaUbicacion(Usuario usuario, Ubicacion ubicacion){

    }
}
