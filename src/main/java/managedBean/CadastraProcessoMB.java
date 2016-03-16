package managedBean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="cadastraProcesso")
public class CadastraProcessoMB {
	
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
