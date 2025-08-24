package dev.java10x.SistemaDeCadastroNinja.MIssoes.entities;

import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.Ninja;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_missoes")
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<Ninja> ninjas;

}

