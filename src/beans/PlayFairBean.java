package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Playfair;

@ManagedBean
public class PlayFairBean {
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
		System.out.println("play inc");

		this.cypher = Playfair.play_fair_enc(plain, key).toString();

		if (this.cypher.equals("1")) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error Key Repeating");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));

		}

	}

	public void test_dec() {
		System.out.println("play dec");
		this.plain = Playfair.play_fair_dec(cypher, key).toString();
		if (this.plain.equals("1")) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error Key Repeating");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("plain is : " + plain));

		}
	}

}
