package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tipo;

public class TipoDaoImpl implements TipoDao {

	
  //Com entityManager	
	protected EntityManager entityManager;
	 
    public TipoDaoImpl() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("processManager");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public Tipo buscaTipo(Long id) {
        return entityManager.find(Tipo.class, id);
    }
	
	@SuppressWarnings("unchecked")
    public List<Tipo> listar() {
        return entityManager.createQuery("from Tipo").getResultList();
    }
	public void inserir(Tipo tipo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(tipo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
/*	public void alterar(Tipo tipo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(tipo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }*/
	public void excluir(Tipo tipo) {
        try {
            entityManager.getTransaction().begin();
            tipo = entityManager.find(Tipo.class, tipo.getId());
            entityManager.remove(tipo);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
	public void removeById(final Long id) {
        try {
        	Tipo tipo = buscaTipo(id);
            excluir(tipo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	//Final EntityManager
	

}