package org.repository;

import org.domain.Automovel;
import org.domain.Cliente;
import org.util.Config;

public class ClienteRepositorioImpl extends JpaRepository<Cliente,Long> {
    @Override
    protected String persistenceUnitName() {
        return Config.getPU();
    }
}
