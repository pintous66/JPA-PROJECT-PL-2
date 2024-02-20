package org.domain;

public class GrupoAutomovel {
    private String classe;
    private int numeroPortas;


    // Nota: duvidas na interpretação do enunciado, não entendemos na totalidade o modelo de negócia do Grupo Automóvel
    public GrupoAutomovel(String classe) {
        if(  classe == null ||  classe.length() == 0 ){
            throw new IllegalArgumentException("Classe inválida");
        }
        this.classe = classe;
        numeroPortas = 0;
    }


    public boolean alterarNumeroPortas(int numeroPortas) {
        if(numeroPortas > 0) {
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
        String s = "Classe = " + classe + " Numero de Portas = " + numeroPortas;
        return s;
    }
}
