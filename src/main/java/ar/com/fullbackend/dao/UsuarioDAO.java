package ar.com.fullbackend.dao;

import ar.com.fullbackend.model.Ubicacion;
import ar.com.fullbackend.model.Usuario;

import java.util.List;

public interface UsuarioDAO {

    List<Usuario> getUsuarios();
    Usuario getUsuarioPorId(int id);
    void ingreasarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    void eliminarUsuario(Usuario usuario);
    void actualizarUltimaUbicacion(Usuario usuario, Ubicacion ubicacion);
}
