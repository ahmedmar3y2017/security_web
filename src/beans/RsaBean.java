package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Rsa;

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
		System.out.println("rsa enc");
		this.cypher = Rsa.Rsa_enc(plain, p, q).toString();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));
	}

	public void test_dec() {
		System.out.println("rsa dec");
		this.plain = Rsa.Rsa_dec(cypher, p, q).toString();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + plain));
	}
}
