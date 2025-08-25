package dev.java10x.SistemaDeCadastroNinja.Ninjas.controller;

import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.NinjaModel;
import dev.java10x.SistemaDeCadastroNinja.Ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar Ninja - POST CREATE
    @PostMapping("/adicionar")
    public String criarNinja(){return  "Ninja criado"; }
    // Mostra todos os ninjas - GET READ
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    // Mostrar todos os Ninjas - GET READ
    @GetMapping("/listar/{id}")
    public Optional<NinjaModel> listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }
    // Atyalizar dados do Ninja - PUT/PATH - UPDATE
    @PutMapping("/alterar")
    public String alterarNinja(){ return "Ninjas atualizado"; }
    // Excluir Ninja - DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaPorId(@PathVariable Long id){ return "O ninja deletado por Id"; }
}
