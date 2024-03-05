package org.mapper;

import org.domain.GrupoAutomovel;
import org.dto.GrupoAutomovelDTO;

import java.util.List;
import java.util.stream.Collectors;

public class GrupoAutomovelMapper {



    public static List<GrupoAutomovelDTO> toGrupoAutomovelDTOList(List<GrupoAutomovel> grupoAutomovelList) {
        return grupoAutomovelList.stream().map(GrupoAutomovelMapper::toGrupoAutomovelDTO).collect(Collectors.toList());
    }

    public static GrupoAutomovelDTO toGrupoAutomovelDTO(GrupoAutomovel grupoAutomovel) {
        return new GrupoAutomovelDTO(grupoAutomovel.Id(), grupoAutomovel.Classe(), grupoAutomovel.NumeroPortas(), grupoAutomovel.Nome());
    }




}
