package org.domain;

public class Automovel {
    public int kms;

    private String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void alterarKms(int kmNovo){
        kms = kmNovo;
    }
}
