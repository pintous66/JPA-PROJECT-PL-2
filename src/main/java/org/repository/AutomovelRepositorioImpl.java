package org.repository;

import org.domain.Automovel;
import org.util.Config;

public class AutomovelRepositorioImpl extends JpaRepository<Automovel,Long> {
    @Override
    protected String persistenceUnitName() {
        return Config.getPU();
    }
}
