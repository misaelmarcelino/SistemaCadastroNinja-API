package dev.java10x.SistemaDeCadastroNinja.MIssoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // Adicionar novas missoes
    @PostMapping("/criar")
    public String criarMissao(){ return  "Missao Criada com sucesso"; }

    // Listar as missoes
    @GetMapping
    public String listarMissao(){ return  "Missao Listadas com sucesso"; }
    // Alterar Missao por ID
    @PutMapping("/alterar/{id}")
    public String alterarMissao(){ return  "Missao Alterada com sucesso"; }
    // Deletar missoes
    @DeleteMapping("/deletar/{id}")
    public String deletarMissao(){ return  "Missao deletada com sucesso"; }

}