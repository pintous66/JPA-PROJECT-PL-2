/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ui;



import org.controller.GrupoAutomovelController;
import org.domain.GrupoAutomovel;
import org.util.Console;

import java.util.List;

/**
 *
 * @author mcn
 */
public class GrupoAutomovelUI {

    private final GrupoAutomovelController controller = new GrupoAutomovelController();


    public void registarGA() {
        System.out.println("*** Registo Grupo Automóvel ***\n");
        String nome = Console.readLine("Nome:");
        int portas = Console.readInteger("Número de portas");
        String classe = Console.readLine("Classe:");
        GrupoAutomovel grupoAutomovel = controller.
                registarGrupoAutomóvel(nome, portas, classe);
        System.out.println("Grupo Automóvel" + grupoAutomovel);
    }
    public void listarGAs() {
        System.out.println("*** Lista de Grupos Automóveis ***\n");
        List<GrupoAutomovel> gruposAutomoveis = controller.
                listarGruposAutomoveis();
        for (GrupoAutomovel grupoAutomovel : gruposAutomoveis) {
            System.out.println(grupoAutomovel);
        }


	}

	public void procurarGAPorID(long id) {
		throw new UnsupportedOperationException("Ainda não implementada.");
	}
}
