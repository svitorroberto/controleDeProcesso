package dao;

import java.util.List;

import model.Tipo;

public interface TipoDao {
	
	public void inserir(Tipo tipo);
	public void excluir(Tipo tipo);
//	public void alterar(Tipo tipo);
	public List<Tipo> listar();
	public Tipo buscaTipo(Long id);

}