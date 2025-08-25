package dev.java10x.SistemaDeCadastroNinja.Ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    // Adicionar Ninja - POST CREATE
    @PostMapping("/adicionar")
    public String criarNinja(){return  "Ninja criado"; }
    // Mostra todos os ninjas - GET READ
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){ return "Mostrar todos os ninja"; }
    // Mostrar todos os Ninjas - GET READ
    @GetMapping("/mostrar/{id}")
    public String mostrarTodosOsNinjasPorId(){ return "Mostrar ninja por ID"; }
    // Atyalizar dados do Ninja - PUT/PATH - UPDATE
    @PutMapping("/alterar")
    public String alterarNinja(){ return "Ninjas atualizado"; }
    // Excluir Ninja - DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaPorId(){ return "O ninja deletado por Id"; }
}
