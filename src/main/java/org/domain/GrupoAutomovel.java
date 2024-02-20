package org.domain;

public class GrupoAutomovel {

    private int numeroPortas;

    public boolean alterarNumeroPortas(int numeroPortas) {
        if(numeroPortas> 0) {
            this.numeroPortas = numeroPortas;
            return true;
        }
        return false;

    }
}
