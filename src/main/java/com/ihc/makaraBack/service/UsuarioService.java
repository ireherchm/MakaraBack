package com.ihc.makaraBack.service;

import com.ihc.makaraBack.dao.UsuarioDAO;
import com.ihc.makaraBack.dto.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public Usuario save(Usuario usuario){
        return this.usuarioDAO.saveAndFlush(usuario);
    }

    public Usuario getUserById(Long id){
        return usuarioDAO.findById(id).orElse(null);
    }

    public List<Usuario> getAllUsers(){
        return usuarioDAO.findAll();
    }

    public void deleteById(Long id){
        usuarioDAO.deleteById(id);
    }
}
