package dev.java10x.SistemaDeCadastroNinja.Ninjas.service;

import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.NinjaModel;
import dev.java10x.SistemaDeCadastroNinja.Ninjas.repository.NinjaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }


}
