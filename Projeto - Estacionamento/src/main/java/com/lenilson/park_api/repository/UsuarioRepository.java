package com.lenilson.park_api.repository;

import com.lenilson.park_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);

    @Query("select u.role from u where u.username like :username")
    Usuario.Role findRoleUsername(String username);
}
