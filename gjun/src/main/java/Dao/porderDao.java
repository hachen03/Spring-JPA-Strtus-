package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Model.porder;

public class porderDao implements implDao {

	public static void main(String[] args) {
		porder p=new porder();
		p.setName("Aqwiejh");
        p.setLcd(1);
        p.setRam(3);
        p.getSum();
        new porderDao().add(p);
	}

	@Override
	public void add(Object o) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(o);
		t.commit();
		em.close();
	}

	@Override
	public Object queryId(int id) {
		EntityManager em=implDao.getDb();
		porder p=em.find(porder.class,id);
	   return p;
	}

	@Override
	public void update(Object o) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.merge(o);
		t.commit();
		em.close();
	}

	@Override
	public void delete(int id) {
		EntityManager em=implDao.getDb();
		EntityTransaction t=em.getTransaction();
		porder p=em.find(porder.class,id);
		t.begin();
		em.remove(p);
		t.commit();
		em.close();
	}

}
