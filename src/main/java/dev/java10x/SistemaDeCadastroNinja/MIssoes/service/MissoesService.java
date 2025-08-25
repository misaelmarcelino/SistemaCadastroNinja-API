package dev.java10x.SistemaDeCadastroNinja.MIssoes.service;

import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import dev.java10x.SistemaDeCadastroNinja.MIssoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
