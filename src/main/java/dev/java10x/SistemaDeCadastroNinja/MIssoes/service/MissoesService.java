package dev.java10x.SistemaDeCadastroNinja.MIssoes.service;

import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import dev.java10x.SistemaDeCadastroNinja.MIssoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Listar Missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar Missoes Por Id
    public Optional<MissoesModel> listarMissoesPorId(Long id){
        return missoesRepository.findById(id);
    }
}
