package com.remya.hibernate.HibernateSample1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.remya.myPacks.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student stu = new Student();
    	stu.setSid(123);
    	stu.setSname("remya");
    	stu.setSgender("female");   	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session se = sf.openSession();
    	Transaction t = se.beginTransaction();
    	se.save(stu);
    	t.commit();
    	
    	
    	
    }
}
