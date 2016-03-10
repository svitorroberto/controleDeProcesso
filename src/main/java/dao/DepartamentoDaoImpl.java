package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Departamento;

public class DepartamentoDaoImpl implements DepartamentoDao {

	
  //Com entityManager	
	protected EntityManager entityManager;
	 
    public DepartamentoDaoImpl() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("processManager");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public Departamento buscaDepartamento(Long id) {
        return entityManager.find(Departamento.class, id);
    }
	
	@SuppressWarnings("unchecked")
    public List<Departamento> listar() {
        return entityManager.createQuery("from Departamento").getResultList();
    }
	public void inserir(Departamento departamento) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(departamento);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
/*	public void alterar(Departamento departamento) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(departamento);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }*/
	public void excluir(Departamento departamento) {
        try {
            entityManager.getTransaction().begin();
            departamento = entityManager.find(Departamento.class, departamento.getId());
            entityManager.remove(departamento);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
	public void removeById(final Long id) {
        try {
        	Departamento departamento = buscaDepartamento(id);
            excluir(departamento);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	//Final EntityManager
	

}