package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Ceaser;

@ManagedBean
public class CeaserBean {

	public int key;
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

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getPlain() {
		return plain;
	}

	public void setPlain(String plain) {
		this.plain = plain;
	}

	public void test() {

		System.out.println("ceaser enc");
		this.cypher = Ceaser.ceaser_enc(plain, key).toString();

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));
	}

	public void test_dec() {
		System.out.println("ceaser dec");
		this.plain = Ceaser.ceaser_dec(cypher, key).toString();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + plain));
	}

}
