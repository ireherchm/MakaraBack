package com.ihc.makaraBack.controller;

import com.ihc.makaraBack.dto.Usuario;
import com.ihc.makaraBack.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/getUserById")
    public Usuario getUserById(Long id){
        return usuarioService.getUserById(id);
    }

    @GetMapping(value = "/getAllUsers")
    public List<Usuario> getAllUsers(){
        return usuarioService.getAllUsers();
    }

    @PostMapping(value="/saveUser")
    public Usuario updateOrSave(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

}
