package org.controller;

import org.domain.Automovel;
import org.domain.GrupoAutomovel;
import org.dto.AutomovelDTO;
import org.mapper.AutomovelMapper;
import org.repository.GrupoAutomovelRepositorioJPAImpl;
import org.repository.JpaRepository;

public class AutomovelController {
    private static final AutomovelMapper mapper = new AutomovelMapper();
    public AutomovelDTO registarAutomovel(String matricula, long idGA) {
        GrupoAutomovelRepositorioJPAImpl repoGA = new GrupoAutomovelRepositorioJPAImpl();
        GrupoAutomovel grupo = repoGA.findById(idGA);
        Automovel auto = new Automovel(matricula, grupo);
        JpaRepository repo =  new GrupoAutomovelRepositorioJPAImpl();
        return  mapper.toAutomovelDTO( (Automovel)repo.add(auto));

    }
}
