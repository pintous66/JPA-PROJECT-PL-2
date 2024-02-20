package org.domain;

public class GrupoAutomovel {
    private String classe;

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
