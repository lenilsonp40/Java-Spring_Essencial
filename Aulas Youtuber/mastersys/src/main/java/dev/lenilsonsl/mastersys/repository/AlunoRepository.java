package dev.lenilsonsl.mastersys.repository;

import dev.lenilsonsl.mastersys.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
