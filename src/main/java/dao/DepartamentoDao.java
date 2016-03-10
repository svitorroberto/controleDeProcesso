package dao;

import java.util.List;

import model.Departamento;

public interface DepartamentoDao {
	
	public void inserir(Departamento departamento);
	public void excluir(Departamento departamento);
//	public void alterar(Departamento departamento);
	public List<Departamento> listar();
	public Departamento buscaDepartamento(Long id);

}