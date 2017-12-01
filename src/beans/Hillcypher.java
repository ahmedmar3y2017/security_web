package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean

public class Hillcypher {

	public int index00;
	public int index01;
	public int index10;
	public int index11;

	String plain;

	String cypher;

	public int getIndex00() {
		return index00;
	}

	public void setIndex00(int index00) {
		this.index00 = index00;
	}

	public int getIndex01() {
		return index01;
	}

	public void setIndex01(int index01) {
		this.index01 = index01;
	}

	public int getIndex10() {
		return index10;
	}

	public void setIndex10(int index10) {
		this.index10 = index10;
	}

	public int getIndex11() {
		return index11;
	}

	public void setIndex11(int index11) {
		this.index11 = index11;
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
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Test Inc "));
	}

	public void test_dec() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Test Dec"));
	}
}
