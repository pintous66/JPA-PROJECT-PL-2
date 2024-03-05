package org.domain;

import jakarta.persistence.Entity;
import org.enums.TipoCliente;

@Entity
public class ClienteEmpresa extends Cliente{

    private TipoCliente tipo;
    public ClienteEmpresa(String nif, String nome, String cartaoCidadao, String cartaConducao) {
        super(nif, nome, cartaoCidadao, cartaConducao);
        this.tipo = TipoCliente.EMPRESA;
    }
    protected ClienteEmpresa(){

    }
}
