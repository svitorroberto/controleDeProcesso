package managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.EtapaDaoImpl;
import model.Etapa;

@ManagedBean(name="pListarProcessoMB")
@SessionScoped
public class PListarProcessoMB {

	private static final long serialVersionUID = 6529685067316457690L;
	
	Etapa etapa = new Etapa();
	List<Etapa> etapas = new ArrayList<Etapa>();
	
	public List<Etapa> listarEtapa(){
		EtapaDaoImpl ed = new EtapaDaoImpl();
		etapas = ed.listarEtapa(1);
		return etapas;
	}
}
