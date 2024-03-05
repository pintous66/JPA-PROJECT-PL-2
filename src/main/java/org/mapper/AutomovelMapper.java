package org.mapper;

import org.domain.Automovel;
import org.dto.AutomovelDTO;

public class AutomovelMapper {
    public static AutomovelDTO toAutomovelDTO(Automovel automovel) {
        return new AutomovelDTO(automovel.Id(), automovel.Kms(), automovel.Matricula(), automovel.GrupoAutomovelID());
    }
}
