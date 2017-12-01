package beans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Diffhelman {

	int q;
	int alpha;
	int xa;
	int xb;

	@PostConstruct
	public void init() {

	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	public int getXa() {
		return xa;
	}

	public void setXa(int xa) {
		this.xa = xa;
	}

	public int getXb() {
		return xb;
	}

	public void setXb(int xb) {
		this.xb = xb;
	}

	// test
	public void test() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("test is "));
	}

}
