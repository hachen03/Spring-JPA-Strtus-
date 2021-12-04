package Controller;

import Dao.DaoFactory;
import Dao.implDao;
import Model.member;

public class addmemberaction {
     private String name;
     private String address;
     private String[] interest;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
     public String execute() throws Exception
     {
    	 DaoFactory p=implDao.a2.getBean("DF",DaoFactory.class);
    	 p.getD().add(new member(getName(),getAddress(),getInterest()));
    	 return "success";
     }
}
