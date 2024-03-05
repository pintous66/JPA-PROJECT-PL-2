package org.domain;

import jakarta.persistence.Entity;
import org.enums.TipoCliente;

import java.lang.annotation.Inherited;

@Entity
public class ClienteIndividual extends Cliente{

    private TipoCliente tipo;
    public ClienteIndividual(String nif, String nome, String cartaoCidadao, String cartaConducao) {
        super(nif, nome, cartaoCidadao, cartaConducao);
        this.tipo = TipoCliente.INDIVIDUAL;
    }
    protected ClienteIndividual(){

    }
}
