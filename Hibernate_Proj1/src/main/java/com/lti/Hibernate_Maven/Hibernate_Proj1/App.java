package com.lti.Hibernate_Maven.Hibernate_Proj1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration configuration=new Configuration().configure();
    	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	
    	
    	SessionFactory factory=configuration.buildSessionFactory(builder.build());
    	Session session=factory.openSession();
    	Employeee emp=new Employeee();
    	emp.setEmpName("aaaaaa");
    	emp.setBranch("ss");
    	session.beginTransaction();
    	session.save(emp);
    	session.getTransaction().commit();
    	
    }
}
