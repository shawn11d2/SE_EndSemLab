package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStudent_id(1);
		s1.setStudent_name("Shawn");
		s1.setStudent_total_points(5);
		
		Student s2=new Student();
		s2.setStudent_id(2);
		s2.setStudent_name("mayu");
		s2.setStudent_total_points(3);
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();

	}

}
