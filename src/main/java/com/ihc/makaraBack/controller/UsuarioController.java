package com.ihc.makaraBack.controller;

import com.ihc.makaraBack.dto.Usuario;
import com.ihc.makaraBack.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @CrossOrigin
    @GetMapping(value = "/usuario")
    public Usuario getById(Long id){
        return usuarioService.getById(id);
    }

    @PostMapping(value="/usuario")
    public Usuario updateOrSave(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

}
