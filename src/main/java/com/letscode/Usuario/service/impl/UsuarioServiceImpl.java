package com.letscode.Usuario.service.impl;

import com.letscode.Usuario.dto.UsuarioRequest;
import com.letscode.Usuario.dto.UsuarioResponse;
import com.letscode.Usuario.model.Usuario;
import com.letscode.Usuario.repository.UsuarioRepository;
import com.letscode.Usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse create(UsuarioRequest usuarioRequest) {
        Usuario usuario = new Usuario(usuarioRequest);
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return new UsuarioResponse(usuarioSalvo);
    }

    @Override
    public UsuarioResponse findById(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        return new UsuarioResponse(usuario);
    }
}
