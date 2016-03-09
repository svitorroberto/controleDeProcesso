package model;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	private int id;
	private String nome;
	private String login;
	private String senha;
	private int departamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	public int getId() {
		return id;
	}
	
	

}
