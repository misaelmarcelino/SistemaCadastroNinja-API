package dev.java10x.SistemaDeCadastroNinja.Ninjas.entities;

import dev.java10x.SistemaDeCadastroNinja.MIssoes.entities.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    // @ManyToOne um ninja pode ter muitas missoes
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
