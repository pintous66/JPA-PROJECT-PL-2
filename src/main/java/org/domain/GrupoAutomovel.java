package org.domain;

public class GrupoAutomovel {
    private String classe;

    private int numeroPortas;




    public boolean alterarNumeroPortas(int numeroPortas) {
        if(numeroPortas> 0) {
            this.numeroPortas = numeroPortas;
            return true;
        }
        return false;

    }
    public boolean alterarClasse(String novaClasse){
        if(novaClasse == null || novaClasse.equals("")){
            return false;
        }
        classe = novaClasse;
        return true;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel{" +
                "classe='" + classe + '\'' +
                '}';
    }
}
