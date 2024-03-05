package org.controller;

import org.domain.Automovel;
import org.domain.GrupoAutomovel;
import org.repository.GrupoAutomovelRepositorioJPAImpl;
import org.repository.JpaRepository;

public class AutomovelController {
    public Automovel registarAutomovel(String matricula, long idGA) {
        GrupoAutomovelRepositorioJPAImpl repoGA = new GrupoAutomovelRepositorioJPAImpl();
        GrupoAutomovel grupo = repoGA.findById(idGA);
        Automovel auto = new Automovel(matricula, grupo);
        JpaRepository repo =  new GrupoAutomovelRepositorioJPAImpl();
        return (Automovel) repo.add(auto);

    }
}
