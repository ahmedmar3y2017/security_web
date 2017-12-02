package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import security.Combination;

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

		System.out.println("Combination enc ");

		this.cypher = Combination.combination_Substitution_enc(plain).toString();

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cypher is : " + cypher));
	}

	public void test_dec() {
		System.out.println("Combination dec ");
		this.plain = Combination.combination_Substitution_dec(cypher).toString();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Plain is : " + plain));
	}

}
