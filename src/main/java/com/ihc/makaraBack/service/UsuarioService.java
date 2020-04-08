package com.ihc.makaraBack.service;

import com.ihc.makaraBack.dao.UsuarioDAO;
import com.ihc.makaraBack.dto.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public Usuario save(Usuario usuario){
        return this.usuarioDAO.saveAndFlush(usuario);
    }

    public Usuario getById(Long id){
        return usuarioDAO.findById(id).orElse(null);
    }
}
