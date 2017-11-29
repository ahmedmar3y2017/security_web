package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CombinationBean {
	public String plain;
	public String cypher;

	@PostConstruct
	private void init() {

	}

	public String getCypher() {
		return cypher;
	}

	public void setCypher(String cypher) {
		this.cypher = cypher;
	}

	public String getPlain() {
		return plain;
	}

	public void setPlain(String plain) {
		this.plain = plain;
	}

	public void test() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + plain));
	}

	public void test_dec() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + cypher));
	}

}
