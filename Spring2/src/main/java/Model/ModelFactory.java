package Model;

public class ModelFactory {
      member m;
      porder p;  
	public ModelFactory() {
		super();
	}
	public ModelFactory(member m, porder p) {
		super();
		this.m = m;
		this.p = p;
	}
	public member getM() {
		return m;
	}
	public void setM(member m) {
		this.m = m;
	}
	public porder getP() {
		return p;
	}
	public void setP(porder p) {
		this.p = p;
	}
     
}
