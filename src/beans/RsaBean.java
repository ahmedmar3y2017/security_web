package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class RsaBean {

	int p;
	int q;
	String plain;
	String cypher;

	@PostConstruct
	public void init() {

	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	public String getPlain() {
		return plain;
	}

	public void setPlain(String plain) {
		this.plain = plain;
	}

	public String getCypher() {
		return cypher;
	}

	public void setCypher(String cypher) {
		this.cypher = cypher;
	}

	public void test() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Test Inc Rsa "));
	}

	public void test_dec() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Test Dec Rsa"));
	}
}
