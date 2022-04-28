package com.letscode.Usuario.controller;

import com.letscode.Usuario.dto.UsuarioRequest;
import com.letscode.Usuario.dto.UsuarioResponse;
import com.letscode.Usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponse create(@RequestBody UsuarioRequest usuarioRequest) {
        return usuarioService.create(usuarioRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioResponse findById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }
}
