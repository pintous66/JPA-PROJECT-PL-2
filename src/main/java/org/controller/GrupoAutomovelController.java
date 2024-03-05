/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;



import org.domain.GrupoAutomovel;
import org.dto.GrupoAutomovelDTO;
import org.mapper.GrupoAutomovelMapper;
import org.repository.GrupoAutomovelRepositorioJPAImpl;
import org.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author eapli
 */
public class GrupoAutomovelController {

    private static final GrupoAutomovelMapper mapper = new GrupoAutomovelMapper();

    public GrupoAutomovelDTO registarGrupoAutomóvel(String nome, int portas,
                                                    String classe) {
        GrupoAutomovel grupo1 = new GrupoAutomovel(nome, portas, classe);
        JpaRepository repo =  new GrupoAutomovelRepositorioJPAImpl();
        return  mapper.toGrupoAutomovelDTO( (GrupoAutomovel) repo.add(grupo1));
    }
    
    public List<GrupoAutomovelDTO> listarGruposAutomoveis() {
		JpaRepository repositorio =  new GrupoAutomovelRepositorioJPAImpl();
        return mapper.toGrupoAutomovelDTOList(repositorio.findAll());
	}

	public GrupoAutomovelDTO procurarGrupoAutomovel(long id) {

        JpaRepository repositorio =  new GrupoAutomovelRepositorioJPAImpl();
        return mapper.toGrupoAutomovelDTO((GrupoAutomovel) repositorio.findById(id));
	}

    public List<GrupoAutomovelDTO> listaGruposAutomoveisDTO() {
        JpaRepository repositorio =  new GrupoAutomovelRepositorioJPAImpl();
         GrupoAutomovelMapper mapper = new GrupoAutomovelMapper();
        return mapper.toGrupoAutomovelDTOList(repositorio.findAll());

    }

        /*  Versão  sem usar padrão repositório
	 private GrupoAutomovel gravarGA(GrupoAutomovel gAuto) {

	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 manager.getTransaction().begin();
	 manager.persist(gAuto);
	 manager.getTransaction().commit();

	 manager.close();
	 return gAuto;
	 }

	 private List<GrupoAutomovel> listarTodos() {


	 EntityManager manager = criarEntityManager("DEMO_ORMPU");

	 Query query = manager.createQuery("select ga from GrupoAutomovel ga");
	 List<GrupoAutomovel> results = query.getResultList();

	 for (GrupoAutomovel result : results) {
	 System.out.println(result);
	 }

	 manager.close();
	 return results;
	 }

	 private EntityManager criarEntityManager(String persistenceUnit) {
	 EntityManagerFactory factory = Persistence.
	 createEntityManagerFactory(persistenceUnit);
	 EntityManager manager = factory.createEntityManager();
	 return manager;
	 }
	 */
}
