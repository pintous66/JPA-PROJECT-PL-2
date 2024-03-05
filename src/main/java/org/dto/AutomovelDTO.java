package org.dto;

public record AutomovelDTO(Long id, int kms, String matricula, Long GAid) {
    public String toString() {
        String s = "Matricula = " + matricula + " Kms = " + kms + "GA id = " + GAid ;
        return s;
    }
}
