package org.domain;

public class GrupoAutomovel {
    private String classe;

    private int numeroPortas;

    public void alterarNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    public void alterarClasse(String novaClasse){
        classe = novaClasse;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel{" +
                "classe='" + classe + '\'' +
                '}';
    }
}
