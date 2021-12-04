package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public interface implDao {
            static Session getDb()
            {
            	 Configuration con=new Configuration().configure();
            	 SessionFactory sf=con.buildSessionFactory();
            	 Session se=sf.openSession();
            			 	return se;
            }
            static ApplicationContext a1=new ClassPathXmlApplicationContext("sp1.xml");
            static ApplicationContext a2=new ClassPathXmlApplicationContext("sp2.xml");
            //新增
            void add(Object o);
            //查詢
            List queryAll();
}
