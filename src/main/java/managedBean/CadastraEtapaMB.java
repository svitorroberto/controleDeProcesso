package managedBean;

import javax.faces.bean.ManagedBean;

import model.Etapa;

@ManagedBean(name="cadastraEtapa")
public class CadastraEtapaMB {
	
	private Etapa etapa;

	public Etapa getEtapa() {
		return etapa;
	}
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	
	
}
