package dev.java10x.SistemaDeCadastroNinja.MIssoes.repository;

import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository  extends JpaRepository<MissoesModel, Long> {

}
