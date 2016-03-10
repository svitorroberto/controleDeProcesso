package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Etapa;

public class EtapaDaoImpl implements EtapaDao {

	
  //Com entityManager	
	protected EntityManager entityManager;
	 
    public EtapaDaoImpl() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("processManager");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public Etapa buscaEtapa(Long numero) {
        return entityManager.find(Etapa.class, numero);
    }
	
	@SuppressWarnings("unchecked")
    public List<Etapa> listar() {
        return entityManager.createQuery("from Etapa").getResultList();
    }
	public void inserir(Etapa etapa) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(etapa);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
/*	public void alterar(Etapa etapa) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(etapa);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }*/
	public void excluir(Etapa etapa) {
        try {
            entityManager.getTransaction().begin();
            etapa = entityManager.find(Etapa.class, etapa.getNumero());
            entityManager.remove(etapa);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
	public void removeById(final Long numero) {
        try {
        	Etapa etapa = buscaEtapa(numero);
            excluir(etapa);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	//Final EntityManager
	

}