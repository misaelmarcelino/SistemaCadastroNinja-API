package dev.java10x.SistemaDeCadastroNinja.Ninjas.service;

import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.NinjaModel;
import dev.java10x.SistemaDeCadastroNinja.Ninjas.repository.NinjaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Criar um novo ninja

    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar Ninjas por Id

    public NinjaModel listarNinjaPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);

        return ninjaPorId.orElse(null);

    }

    // Atualiazar
    public NinjaModel atualizarNinjaPorI(Long id, NinjaModel ninjaAtualizado){

        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }


    // Deletar ninja por Id - tem que ser VOID
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }



}
