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
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostra todos os ninjas - GET READ
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar todos os Ninjas - GET READ
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    // Atyalizar dados do Ninja - PUT/PATH - UPDATE
    @PutMapping("/alterar/{id}")
    public NinjaModel atualizarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinjaPorI(id, ninjaAtualizado);
    }

    // Excluir Ninja - DELETE
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
}
