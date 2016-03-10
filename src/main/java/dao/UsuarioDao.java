package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDao {
	
	public void inserir(Usuario usuario);
	public void excluir(Usuario usuario);
	public void alterar(Usuario usuario);
	public List<Usuario> listar();
	public Usuario buscaUsuario(Long matricula);

}