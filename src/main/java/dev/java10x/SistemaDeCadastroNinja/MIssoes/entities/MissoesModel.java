package dev.java10x.SistemaDeCadastroNinja.MIssoes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.SistemaDeCadastroNinja.Ninjas.entities.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;

}

