package Dao;

public class DaoFactory {
       private memberDao d;
       private porderDao p;   
	public DaoFactory() {
		super();
	}
	public DaoFactory(memberDao d, porderDao p) {
		super();
		this.d = d;
		this.p = p;
	}
	public memberDao getD() {
		return d;
	}
	public void setD(memberDao d) {
		this.d = d;
	}
	public porderDao getP() {
		return p;
	}
	public void setP(porderDao p) {
		this.p = p;
	}
       
}
