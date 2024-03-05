package org.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class  Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nif;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String cartaoCidadao;

    @Getter
    @Setter
    private String cartaConducao;


    public Cliente(String nif, String nome, String cartaoCidadao, String cartaConducao) {
        this.nif = nif;
        this.nome = nome;
        this.cartaoCidadao = cartaoCidadao;
        this.cartaConducao = cartaConducao;

    }
    protected Cliente(){

    }




}
