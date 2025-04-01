package com.lenilson.park_api.web.controller;


import com.lenilson.park_api.entity.Usuario;
import com.lenilson.park_api.service.UsuarioService;
import com.lenilson.park_api.web.dto.UsuarioCreateDto;
import com.lenilson.park_api.web.dto.UsuarioResponseDto;
import com.lenilson.park_api.web.dto.UsuarioSenhaDto;
import com.lenilson.park_api.web.dto.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioResponseDto> create(@RequestBody UsuarioCreateDto createDto) {
        Usuario user = usuarioService.salvar(UsuarioMapper.toUsuario(createDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioMapper.toDto(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDto> getById(@PathVariable Long id) {
        Usuario user = usuarioService.buscarPorId(id);
        return ResponseEntity.ok(UsuarioMapper.toDto(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> uptadePassword(@PathVariable Long id,
                                                  @RequestBody UsuarioSenhaDto usuarioSenhaDto) {
        Usuario user = usuarioService.editarSenha(id, usuarioSenhaDto.getSenhaAtual(), usuarioSenhaDto.getNovaSenha(),
                usuarioSenhaDto.getConfirmaSenha());
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> users = usuarioService.buscarTodos();
        return ResponseEntity.ok(users);
    }

}
