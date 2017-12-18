package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Transposition;

@ManagedBean
public class TranspositionBean {
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

		cypher = Transposition.transposition_enc(plain, key).toString();
		if (cypher.equals("") || cypher == null) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
					"Key Not Contain Duplication char");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));

		}

	}

	public void test_dec() {

		this.plain = Transposition.decrypt(cypher, key);

		if (this.plain.equals("1")) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
					"the number of the cypher length must be divisable of the length of key");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + this.plain));

		}

	}

}
