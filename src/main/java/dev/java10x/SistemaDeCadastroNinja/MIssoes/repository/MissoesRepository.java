package dev.java10x.SistemaDeCadastroNinja.MIssoes.repository;

import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MissoesRepository  extends JpaRepository<MissoesModel, Long> {

        Optional<MissoesModel> findById(Long ninja);
        List<MissoesModel> findByNinja(Long ninja);
}
