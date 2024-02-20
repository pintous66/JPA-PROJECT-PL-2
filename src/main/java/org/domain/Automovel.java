package org.domain;

public class Automovel {
    public int kms;

    private int KMS_BY_OMISSION = 0;

    private final String matricula;

    public Automovel(String matricula){
        if(matricula.length() == 0){
            throw new IllegalArgumentException("Matricula inválida");
        }
        this.matricula = matricula;
        this.kms = KMS_BY_OMISSION;
    }


    public String getMatricula() {
        return matricula;
    }
    public void alterarKms(int kmNovo){
        kms = kmNovo;
    }
}
