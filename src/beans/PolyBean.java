package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Ploy;

@ManagedBean
public class PolyBean {
	public String key;
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

	//
	public String getPlain() {
		return plain;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setPlain(String plain) {
		this.plain = plain;
	}

	public void test() {
		System.out.println("poly inc");

		this.cypher = Ploy.ploy_enc(plain, key).toString();

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));
	}

	public void test_dec() {
		System.out.println("Poly dec");
		this.plain = Ploy.ploy_dec(cypher, key).toString();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + plain));
	}

}
