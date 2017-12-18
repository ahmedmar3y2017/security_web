package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Affine;

@ManagedBean
public class AffineBean {

	int k;
	int n;
	int m;

	public String plain;
	public String cypher;

	@PostConstruct
	private void init() {

	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
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
		System.out.println("Affine enc");

		this.cypher = Affine.affine_enc(m, plain, k, n).toString();
		// Gcd != 1
		if (cypher.equals("1")) {

			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Gcd != 1");
			FacesContext.getCurrentInstance().addMessage(null, message);

		}
		// m not less than n
		else if (cypher.equals("2")) {

			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "m not less than n ");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));

		}

	}

	public void test_dec() {
		System.out.println("Affine dec");
		this.plain = Affine.affine_dec(m, cypher, k, n).toString();
		// Gcd != 1
		if (plain.equals("1")) {

			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Gcd != 1");
			FacesContext.getCurrentInstance().addMessage(null, message);

		}
		// m not less than n
		else if (plain.equals("2")) {

			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "m not less than n ");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + plain));
		}
	}

}
