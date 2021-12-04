package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface implDao {
       public static Connection getDb()
       {
    	   String url="jdbc:mysql://localhost:3306/company";
    	   String user="root";
    	   String password="1234";
    	   Connection conn=null;
    	   try
    	   {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   conn=DriverManager.getConnection(url,user,password);
    	   }
    	   catch(ClassNotFoundException e)
    	   {
    		   e.printStackTrace();
    	   }
    	   catch(SQLException e)
    	   {
    		   e.printStackTrace();
    	   }
    	   return conn;
       }
       //�s�W
       void add(Object o);
       //�d��
       String queryAll();
       String querySum(int start,int end);
       String queryId(int id);
       //�ק�
       void update(int id,Object o);
       //�R��
       void delete(int id);
}
