package dev.java10x.SistemaDeCadastroNinja.MIssoes.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import dev.java10x.SistemaDeCadastroNinja.MIssoes.service.MissoesService;
import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.NinjaModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // Adicionar novas missoes
    @PostMapping("/criar")
    public MissoesModel criarMissao(MissoesModel missao){
        return missoesService.criarMissoes(missao);
    }

    // Listar as missoes
    @GetMapping
    public List<MissoesModel> listarMissoes(){
        return  missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }
    // Alterar Missao por ID
    @PutMapping("/alterar/{id}")
    public String alterarMissao(){ return  "Missao Alterada com sucesso"; }
    // Deletar missoes
    @DeleteMapping("/deletar/{id}")
    public void deletarMissaoPorId(@PathVariable Long id){
        missoesService.deleteMissoesPorId(id);
    }

}