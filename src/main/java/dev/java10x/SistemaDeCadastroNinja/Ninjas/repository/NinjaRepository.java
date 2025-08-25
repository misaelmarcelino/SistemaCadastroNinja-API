package dev.java10x.SistemaDeCadastroNinja.Ninjas.repository;

import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface NinjaRepository  extends JpaRepository<NinjaModel, Long> {

    Optional<NinjaModel> findById(Long id);
    List<NinjaModel> findByNome(String nome);
    List<NinjaModel> findByEmail(String email);

}
