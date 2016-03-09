package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="processo")
public class Processo {
	
	@Id
	private int numero;
	private int ordem;
	private int dpto_origem;
	private int tipo;
	private Date data_entrada;
	private Date data_saida;
	private String passo_decisorio;
	private String descricao;
	private int usuario_resp;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public int getDpto_origem() {
		return dpto_origem;
	}
	public void setDpto_origem(int dpto_origem) {
		this.dpto_origem = dpto_origem;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Date getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}
	public Date getData_saida() {
		return data_saida;
	}
	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}
	public String getPasso_decisorio() {
		return passo_decisorio;
	}
	public void setPasso_decisorio(String passo_decisorio) {
		this.passo_decisorio = passo_decisorio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getUsuario_resp() {
		return usuario_resp;
	}
	public void setUsuario_resp(int usuario_resp) {
		this.usuario_resp = usuario_resp;
	}
	
	
}
