/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.repository;

import org.domain.GrupoAutomovel;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.util.Config;

/**
 *
 * @author eapli
 */
public class GrupoAutomovelRepositorioJPAImpl extends JpaRepository<GrupoAutomovel, Long> {


    public GrupoAutomovelRepositorioJPAImpl() {
        super();
    }


    @Override
    protected String persistenceUnitName() {
         return Config.getPU();
    }

}
