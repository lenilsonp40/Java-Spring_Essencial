package com.lenilson.park_api.web.controller;


import com.lenilson.park_api.entity.Usuario;
import com.lenilson.park_api.service.UsuarioService;
import com.lenilson.park_api.web.dto.UsuarioCreateDto;
import com.lenilson.park_api.web.dto.UsuarioResponseDto;
import com.lenilson.park_api.web.dto.UsuarioSenhaDto;
import com.lenilson.park_api.web.dto.mapper.UsuarioMapper;
import com.lenilson.park_api.web.exception.ErrorMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Usuarios", description = "Contém operações relativas aos usuarios.")
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Operation(summary = "Criar um novo usuário", description = "Recurso para criar um novo usuário",
                responses = {
                                @ApiResponse(responseCode = "201", description = "Recurso criando com sucesso",
                                                content = @Content(mediaType = "application/json",
                                                schema = @Schema(implementation = UsuarioResponseDto.class))),
                                @ApiResponse(responseCode = "409", description = "Usuário e-mail já cadastrado no sistema",
                                                content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))),
                                @ApiResponse(responseCode = "422", description = "Dados de entrada inválido",
                                                content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class)))
                })
    @PostMapping
    public ResponseEntity<UsuarioResponseDto> create(@Valid @RequestBody UsuarioCreateDto createDto) {
        Usuario user = usuarioService.salvar(UsuarioMapper.toUsuario(createDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioMapper.toDto(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDto> getById(@PathVariable Long id) {
        Usuario user = usuarioService.buscarPorId(id);
        return ResponseEntity.ok(UsuarioMapper.toDto(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> uptadePassword(@Valid @PathVariable Long id,
                                                  @RequestBody UsuarioSenhaDto usuarioSenhaDto) {
        Usuario user = usuarioService.editarSenha(id, usuarioSenhaDto.getSenhaAtual(), usuarioSenhaDto.getNovaSenha(),
                usuarioSenhaDto.getConfirmaSenha());
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioResponseDto>> getAll() {
        List<Usuario> users = usuarioService.buscarTodos();
        return ResponseEntity.ok(UsuarioMapper.toListDto(users));
    }

}
