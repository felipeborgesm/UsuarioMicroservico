package com.letscode.Usuario.service;

import com.letscode.Usuario.dto.UsuarioRequest;
import com.letscode.Usuario.dto.UsuarioResponse;

public interface UsuarioService {
    UsuarioResponse create(UsuarioRequest usuarioRequest);

    UsuarioResponse findById(Long id);
}
