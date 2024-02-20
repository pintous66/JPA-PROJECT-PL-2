package org.domain;

public class Automovel {
    public int kms;

    private int KMS_BY_OMISSION = 0;
    private String MATRICULA_BY_OMISSION = "00-00-00";
    private String matricula;

    public Automovel(){
        this.matricula = MATRICULA_BY_OMISSION;
        this.kms = KMS_BY_OMISSION;
    }

    public boolean setMatricula(String matricula){
        if(matricula.length() == 8){
            this.matricula = matricula;
            return true;
        }
        return false;
    }
    public String getMatricula() {
        return matricula;
    }
    public void alterarKms(int kmNovo){
        kms = kmNovo;
    }
}
