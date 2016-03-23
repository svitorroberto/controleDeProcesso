package managedBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.DepartamentoDaoImpl;
import dao.EtapaDaoImpl;
import dao.TipoDaoImpl;
import model.Departamento;
import model.Etapa;
import model.Tipo;

@ManagedBean(name="cadastraEtapa")
@SessionScoped
public class CadastraEtapaMB implements Serializable{
	private static final long serialVersionUID = 6529685098267757690L;
	Etapa etapa = new Etapa();

	
	public List<Departamento> pegarDepartamentos(){
		DepartamentoDaoImpl d = new DepartamentoDaoImpl();
		return d.listar();
	}
	public List<Tipo> pegarTipos(){
		TipoDaoImpl t = new TipoDaoImpl();
		return t.listar();
	}
	
	
	public String criarEtapa(){
		Date data = new Date();
		etapa.setOrdem(1);
		System.out.println(data);
		etapa.setData_entrada(data);
		etapa.setData_saida(data);
		etapa.setPasso_decisorio("Não");
		new EtapaDaoImpl().inserir(etapa);
		etapa = new Etapa();
		addMessage("Processo Cadastrado com sucesso!");
		return "matricula";
		
	}
	
	public String adicionarEtapa(){
		etapa.setOrdem(1);
		new EtapaDaoImpl().inserir(etapa);
		etapa = new Etapa();
		return "matricula";
		
	}
	
	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Etapa getEtapa() {
		return etapa;
	}
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	public void cadastrar() {
        
    }

	
	
}
