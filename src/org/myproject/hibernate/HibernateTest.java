package org.myproject.hibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import MyModelClasses.dto.Address;
import MyModelClasses.dto.Bank;
import MyModelClasses.dto.CorparateBanks;
import MyModelClasses.dto.Employee;
import MyModelClasses.dto.Paymentevents_temp;
import MyModelClasses.dto.RetailBanks;
import MyModelClasses.dto.TransactionTracking;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		//Employee employee = new Employee();
		
		/*employee.setEmpID(123);
		employee.setEmpName("Sushant");
		
		
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();*/
		
		//employee = null;
		//Session session1 = sessionfactory.openSession();
		//session1.beginTransaction();
		//employee = (Employee)session1.get(Employee.class,1);//Getting Values from Database using Hibernate
		//System.out.println("Employee Id ="+employee.getEmpID()+" Employee Name = "+employee.getEmpName());
		/*
		Address add = new Address();
		add.setCity("Mumbai");
		add.setStreet("Dr.Ambedkar rd");
		add.setState("Maharashtra");
		add.setPincode("123456");
		
		Address add_home = new Address();
		add_home.setCity("Dubai");
		add_home.setStreet("Dr.Ambedkar rd");
		add_home.setState("Maharashtra");
		add_home.setPincode("123456");
		*/
		/*Employee employee2 = new Employee();
		employee2.setHome_address(add_home);
		employee2.setEmpName("Sushant");
		
		Employee employee3 = new Employee();
		employee3.setHome_address(add);
		employee3.setEmpName("Sushant");
		
		Session session2 = sessionfactory.openSession();
		session2.beginTransaction();
		session2.save(employee2);
		session2.getTransaction().commit();
		session2.close();
		
		Session session4 = sessionfactory.openSession();
		session4.beginTransaction();
		session4.save(employee3);
		session4.getTransaction().commit();
		session4.close();

		Session session3 = sessionfactory.openSession();
		session3.beginTransaction();
		employee2 = (Employee)session3.get(Employee.class, 1);
		System.out.println("Employee Id ="+employee2.getEmpID()+" Employee Name = "+employee2.getEmpName()+"  Address = "+employee2.getHome_address().getStreet()+","+employee2.getHome_address().getCity()+","+employee2.getHome_address().getState());
		*/
		/*
		Employee employee5 = new Employee();
		employee5.setEmpName("Kunal");
		employee5.getListofAddress().add(add_home) ;//For Collection we have get method to add the objects instead of set.
		employee5.getListofAddress().add(add);

		Session session5 = sessionfactory.openSession();
		session5.beginTransaction();
		session5.save(employee5);
		session5.getTransaction().commit();
		
		Session session6 = sessionfactory.openSession();
		session6.beginTransaction();
		Employee employee6 = (Employee) session6.get(Employee.class, 1);
		System.out.println("Employee Id ="+employee6.getEmpID()+" Employee Name = "+employee6.getEmpName());
		session6.close();//If its lazy loading then if we close the session at this instance then the list of address are not loaded and we get an error of LazyInitializationException.
		//To avoid this we have to declare the fetch type at the list declaration level @ElementCollection(fetch=FetchType.EAGER).
	    employee6.getListofAddress();
		System.out.println(employee6.getListofAddress().size());
		*/
		/*
		Session session5 = sessionfactory.openSession();
		session5.beginTransaction();
		Employee employee = new Employee();//Transient object
		employee.setEmpID(123);
		employee.setEmpName("Sushant");
		Employee employee1 = new Employee();//Transient object
		employee.setEmpID(2);
		employee.setEmpName("Anish");
		Employee employee2 = new Employee();//Transient object
		employee.setEmpID(3);
		employee.setEmpName("Rishabh");
		Employee employee3 = new Employee();//Transient object
		employee.setEmpID(4);
		employee.setEmpName("Vikas");
		Employee employee4 = new Employee();//Transient object
		employee.setEmpID(5);
		employee.setEmpName("Vivek");
		Employee employee5 = new Employee();//Transient object
		employee.setEmpID(6);
		employee.setEmpName("Pandya");
		Employee employee6 = new Employee();//Transient object
		employee.setEmpID(7);
		employee.setEmpName("Dhoni");
		Employee employee7 = new Employee();//Transient object
		employee.setEmpID(8);
		employee.setEmpName("Virat");
		Employee employee8 = new Employee();//Transient object
		employee.setEmpID(9);
		employee.setEmpName("Raina");
		Employee employee9 = new Employee();//Transient object
		employee.setEmpID(10);
		employee.setEmpName("Sachin");
		
		*/
		//Bank b1 = new Bank();//New Entity class to understand One To One mapping.Make entry in hibernate.cfg.xml and add @Entity What if we have such type of Entity inside another Entity Class.
		//We need to have some mapping inside the Entity class or else it throws MappingExceptions. We will insert these entity objects seperately and will have and foregin refference with another entity.
		//Hibernate does this for you by @OneToOne notation. It creates an foregion refference coloum in the parent entity and associates value in that coloumn when ever a new entry is posted in the child entity
		//First the entry is added in the bank table and based on the self generated value in of bank_Id column it updated the same in Parent Entity ie Employee. So a sequence of two inserts and one update occurs. 
		/*//OneToOne
		b1.setBank_Name("HDFC");
		
		employee.setBank(b1);
		session5.save(employee);
		session5.save(b1);
		session5.getTransaction().commit();
		*/
		//Bank b2 = new Bank();
		//b1.setBank_Name("HDFC"); 
		//b2.setBank_Name("YES BANK");
		//employee.getBank().add(b1);
		//employee.getBank().add(b2);
		//b1.getEmployee().add(employee);
		//b2.getEmployee().add(employee);
		//CorparateBanks cb = new CorparateBanks();
		//RetailBanks rb = new RetailBanks();
		
		//cb.setCorpAcc_type("Dmat Account");
		//rb.setAccount_Type("CASA Account");
		//session5.save(employee);//Persistent object
		/*session5.save(employee1);//Persistent object
		session5.save(employee2);//Persistent object
		session5.save(employee3);//Persistent object
		session5.save(employee4);//Persistent object
		session5.save(employee5);//Persistent object
		session5.save(employee6);//Persistent object
		session5.save(employee7);//Persistent object
		session5.save(employee8);//Persistent object
		session5.save(employee9);//Persistent object
		
		*/
		//session5.save(b1);
		//session5.save(b2);
		//session5.save(cb);
		//session5.save(rb);
		//cb.setCorpAcc_type("FCAT Account");
		//employee.setEmpName("Dhoni");
		//employee.setEmpName("Virat");
		//employee.setFavPlayer("Dhoni");
	   //session5.getTransaction().commit();
		//employee.setFavPlayer("Dhoni07");//Detached object
		
		
		
		/////////////////////////HQL///////////////////////////////////////
		
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		//Query query =  session.createQuery("from Employee");
		//Query query =  session.getNamedQuery("Employee.byid");
		//query.setParameter(0, 1);
		//Query query1 =  session.getNamedQuery("Employee.byName");
		//query.setParameter(0, "Sachin");
		@SuppressWarnings("unchecked")  
		//List<Employee> resultset = (List<Employee>) query.list();
		//System.out.println("Size of list"+resultset.size());
		
		//Iterator<Employee> itr = resultset.iterator();
		
		//while (itr.hasNext())
		//{
		//	System.out.println(itr.next().getEmpName());
			
		//}
		
		//System.out.println("Hiout");
		//for(Employee u : resultset)
		//{
		//	System.out.println(u.getEmpName());
		//}
		Paymentevents_temp p1 = new Paymentevents_temp(); 
		p1.id=1;
		TransactionTracking tt = new TransactionTracking();
		tt.setTrackingID(7);
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		
		b1.setBank_Id(7);
		b2.setBank_Id(7);
		System.out.println(b1.equals(b2));
		tt.setBank(b1);
		session.save(b1);
		//session.save(p1);
		//session.getTransaction().commit();
		session.close();
		
		
	}

}
