package org.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GrupoAutomovel {
    /*
    * Classe do automovel, só sabemos que em principio não pode ser vazia nem nula
    *  Nota: duvidas na interpretação do enunciado, não entendemos na totalidade o modelo de negócia do Grupo Automóvel
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String classe;
    /*
    * Numero de portas do automovel, não pode ser inferior a zero
     */
    private int numeroPortas;

    private String nome;


    /*
       * Construtor de GrupoAutomovel, valida a classe se é nula ou vazia, lança uma excepção se for o caso
       * Inicializa com 0 o número de portas e deixa a responsabilidade de alterar para o método alterarNumeroPortas
     */
     public GrupoAutomovel(String classe) {
        if(  classe == null ||  classe.length() == 0 ){
            throw new IllegalArgumentException("Classe inválida");
        }
        this.classe = classe;
        numeroPortas = 0;
    }

    public GrupoAutomovel() {

    }

    public GrupoAutomovel(String nome, int portas, String classe) {
            this.nome = nome;
            this.numeroPortas = portas;
            this.classe = classe;
    }

    /*
    * Método que altera o número de portas do automovel, valida se o novo valor é superior a zero, se for altera o valore e retorna true, se não retorna falso
     */
    public boolean alterarNumeroPortas(int numeroPortas) {
        if(numeroPortas > 0) {
            this.numeroPortas = numeroPortas;
            return true;
        }
        return false;

    }
    /*
    * Método que altera a classe do veiculo, valida se a nova classe é nula ou vazia, se for altera o valore e retorna true, se não retorna falso
     */
    public boolean alterarClasse(String novaClasse){
        if(novaClasse == null || novaClasse.equals("")){
            return false;
        }
        classe = novaClasse;
        return true;
    }

    /*
    * Método que retorna a representação textual do automovel
     */
    @Override
    public String toString() {
        String s = "Classe = " + classe + " Numero de Portas = " + numeroPortas;
        return s;
    }
}
