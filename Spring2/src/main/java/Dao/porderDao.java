package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class porderDao implements implDao {
	public static void main(String args[])
    {
    	
    }

	@Override
	public void add(Object o) {
		Session se=implDao.getDb();
		Transaction t=se.beginTransaction();
		se.save(o);
		t.commit();
		se.close();
	}

	@Override
	public List queryAll() {
		Session se=implDao.getDb();
		String HQL="from member";
		Query q=se.createQuery(HQL);
		
		List l=q.list();
		
		return l;
	}
}
