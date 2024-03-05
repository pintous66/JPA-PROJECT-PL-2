package org.dto;

public record GrupoAutomovelDTO(Long id, String classe, int numeroPortas, String nome) {

    public String toString() {
        String s = "ID = " + id + "\nClasse = " + classe + "\nNumero de Portas = " + numeroPortas;
        return s;
    }

    public Long getId() {
        return id;
    }
    public String getClasse() {
        return classe;
    }
    public int getNumeroPortas() {
        return numeroPortas;
    }
    public String getNome() {
        return nome;
    }
}

