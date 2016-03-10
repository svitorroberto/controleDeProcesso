package dao;

import java.util.List;

import model.Etapa;

public interface EtapaDao {
	
	public void inserir(Etapa etapa);
	public void excluir(Etapa etapa);
//	public void alterar(Etapa etapa);
	public List<Etapa> listar();
	public Etapa buscaEtapa(Long numero);

}