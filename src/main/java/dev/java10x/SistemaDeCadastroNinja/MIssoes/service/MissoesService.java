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

    // Criar novas missoes

    public MissoesModel criarMissoes(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }

    // Listar Missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar Missoes Por Id
    public MissoesModel listarMissoesPorId(Long Id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(Id);
        return missoesPorId.orElse(null);
    }

    // Deletar Mmissoes por Id
    public MissoesModel deleteMissoesPorId(Long Id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(Id);

        if(missoesPorId.isPresent()){
            missoesRepository.deleteById(Id);
        }
        return missoesPorId.orElse(null);
    }

}
