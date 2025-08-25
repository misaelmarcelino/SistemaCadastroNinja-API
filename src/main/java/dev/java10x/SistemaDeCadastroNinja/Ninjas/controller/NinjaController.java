package dev.java10x.SistemaDeCadastroNinja.Ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha rota inicial";
    }


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
