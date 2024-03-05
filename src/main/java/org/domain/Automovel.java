package org.domain;

import jakarta.persistence.Entity;
import java.util.Objects;


public class Automovel {
    /*
    * kms do automovel
    * não podem ser inferiores a zero, nem pode passar de um valor superior para um inferior
     */
    public int kms;

    /*
    * Por omissão um carro começa com 0 km
     */
    private int KMS_BY_OMISSION = 0;

    /*
    * Matricula do automovel não pode ser nula nem vazia, o resto depende de países e de regras de cada país
     */
    private final String matricula;

    /*
    * Construtor de Automovel, valida a matricula se é nula ou vazia, lança uma excepção se for o caso
     */

    public Automovel(String matricula){
        if(  matricula == null ||  matricula.length() == 0 ){
            throw new IllegalArgumentException("Matricula inválida");
        }
        this.matricula = matricula;
        this.kms = KMS_BY_OMISSION;
    }


    /*
    * Método que retorna a matricula do automovel
     */
    public String getMatricula() {
        return matricula;
    }
    /*
    * Método que altera os kms do automovel, valida se o novo valor é superior ao actual, se for altera o valore e retorna true, se não retorna falso
     */
    public boolean alterarKms(int kmNovo){
        if(kmNovo > kms){
            kms = kmNovo;
            return true;

        }
        return false;


    }

    /*
    * Método que retorna a representação textual do automovel
     */
    @Override
    public String toString() {
        String s = "Matricula = " + matricula + " Kms = " + kms;
        return s;
    }
}
