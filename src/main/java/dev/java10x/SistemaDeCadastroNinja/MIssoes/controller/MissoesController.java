package dev.java10x.SistemaDeCadastroNinja.MIssoes.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import dev.java10x.SistemaDeCadastroNinja.MIssoes.service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // Adicionar novas missoes
    @PostMapping("/criar")
    public String criarMissao(){ return  "Missao Criada com sucesso"; }

    // Listar as missoes
    @GetMapping
    public List<MissoesModel> listarMissoes(){
        return  missoesService.listarMissoes();
    }
    // Alterar Missao por ID
    @PutMapping("/alterar/{id}")
    public String alterarMissao(){ return  "Missao Alterada com sucesso"; }
    // Deletar missoes
    @DeleteMapping("/deletar/{id}")
    public String deletarMissao(){ return  "Missao deletada com sucesso"; }

}