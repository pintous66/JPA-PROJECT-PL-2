package org.ui;

import org.controller.AutomovelController;
import org.controller.GrupoAutomovelController;
import org.domain.Automovel;
import org.domain.GrupoAutomovel;
import org.util.Console;

public class AutomovelUI {

    private final AutomovelController controller = new AutomovelController();
    private final GrupoAutomovelController grupoAutomovelController = new GrupoAutomovelController();
    public void registarAutomovel() {
        System.out.println("*** Registo Automóvel ***\n");
        String matricula = Console.readLine("Matricula:");

        grupoAutomovelController.listaGruposAutomoveisDTO().forEach(System.out::println);
        long idGA = Console.readLong("Escolha o id do grupo automóvel");



        System.out.println("Automovel criado:\n" + controller.registarAutomovel(matricula, idGA) );
    }
}
