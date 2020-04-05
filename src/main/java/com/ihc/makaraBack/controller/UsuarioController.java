package com.ihc.makaraBack.controller;

import com.ihc.makaraBack.dto.Usuario;
import com.ihc.makaraBack.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/usuario")
    public Usuario getById(Integer id){
        return usuarioService.getById(id);
    }

    @PostMapping(value="/usuario")
    public Usuario updateOrSave(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

}
