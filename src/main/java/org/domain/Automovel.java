package org.domain;

import java.util.Objects;

public class Automovel {
    public int kms;

    private int KMS_BY_OMISSION = 0;

    private final String matricula;

    public Automovel(String matricula){
        if(  matricula == null ||  matricula.length() == 0 ){
            throw new IllegalArgumentException("Matricula inválida");
        }
        this.matricula = matricula;
        this.kms = KMS_BY_OMISSION;
    }


    public String getMatricula() {
        return matricula;
    }
    public boolean alterarKms(int kmNovo){
        if(kmNovo > kms){
            kms = kmNovo;
            return true;

        }
        return false;

    }

    @Override
    public String toString() {
        String s = "Matricula = " + matricula + " Kms = " + kms;
        return s;
    }
}
