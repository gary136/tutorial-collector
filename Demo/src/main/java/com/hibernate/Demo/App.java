package com.hibernate.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
//        write
    	
//        connect
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();    	
        
//        Alien telusko = new Alien();        
//        telusko.setAid(1);
//        telusko.setName("navin");
//        telusko.setColor("Green");
//        telusko.setAid(2);
//        telusko.setName("Sarang");
//        telusko.setColor("White");
//        telusko.setAid(3);
//        telusko.setName("Mridula");
//        telusko.setColor("Blue");    
//        telusko.setAid(4); 
//        telusko.setName("Harsh");
//        telusko.setColor("Cyan");  
//        session.save(telusko);
        
//        embeddable
//        AlienName an = new AlienName();
//        an.setfName("NavinKumarReddy");
//        an.setlName("Thatipalli");
//        an.setmName("BapReddy");
//        telusko.setAid(1);
//        telusko.setName(an);
//        telusko.setColor("Green");
//        session.save(telusko);
        
//        fetch
//        Alien telusko = null;
//        telusko = (Alien) session.get(Alien.class, 1); 
        
//        tx.commit();        
//        System.out.println(telusko);    	
        
//        Mapping
//        connect (must add all class that would be used)
//        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();
//        
//        Laptop laptop = new Laptop();
//        laptop.setLid(1);
//        laptop.setlName("Dell");
//        Student s = new Student();
//        s.setName("Navin");
//        s.setRollno(1);
//        s.setMarks(100);
//        s.setLaptop(laptop);
//        s.getLaptops().add(laptop);  
//        laptop.getStudents().add(s);
//        session.save(laptop);
//        session.save(s);
//        tx.commit();
        
//        fetch
//        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class).addAnnotatedClass(Student.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction(); 
//        
//      Laptop l1 = new Laptop();
//      l1.setLid(1);
//      l1.setlName("Dell");
//      Laptop l2 = new Laptop();
//      l2.setLid(3);
//      l2.setlName("Asus");
//      Laptop l3 = new Laptop();
//      l3.setLid(5);
//      l3.setlName("Samsung");
//      
//      Student s = new Student();
//      s.setName("Navin");
//      s.setRollno(1);
//      s.setMarks(100);
//      s.getLaptops().add(l1);  
//      
//      Alien telusko = new Alien();        
//	    telusko.setAid(1);
//	    telusko.setName("navin");
//	    telusko.getLaptops().add(l1);
//	    telusko.getLaptops().add(l2);
//	    telusko.getLaptops().add(l3);
//    
//      l1.getStudents().add(s);
//      l1.getAliens().add(telusko);
//      l2.getAliens().add(telusko);
//      l3.getAliens().add(telusko);
//      session.save(l1);
//      session.save(l2);
//      session.save(l3);
//      session.save(s);
//      session.save(telusko);            

//    	Alien a1 = (Alien) session.get(Alien.class, 1);   
//	    System.out.println(a1.getName()); 
//	    List<Laptop> laptops = a1.getLaptops();
//	    for (Laptop l : laptops) {
//	    	System.out.println(l.getlName());    	
//	    }      
//	    tx.commit();        
	    
//    	cache
//	    Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//	    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//	    SessionFactory sf = con.buildSessionFactory(reg);	
//	    Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();    
        
//	    Alien telusko = new Alien();        
//	    telusko.setAid(1);
//	    telusko.setName("navin");
//	    telusko.setColor("Green");
//	    session.save(telusko);
//        tx.commit();
//        session.close();
	    
//        Alien a = new Alien();
//	    Session session1 = sf.openSession();
//	    session1.beginTransaction(); 	 
//	    Session session2 = sf.openSession();
//	    session2.beginTransaction(); 
	      
//	    a = (Alien) session1.get(Alien.class, 1);
//	    System.out.println(a);	    
//	    a = (Alien) session2.get(Alien.class, 1);
//	    System.out.println(a);	    

//	    Query q1 = session1.createQuery("from Alien where aid = 1");
//	    q1.setCacheable(true);
//	    a = (Alien)q1.uniqueResult();
//	    System.out.println(a);
//	    Query q2 = session1.createQuery("from Alien where aid = 1");
//	    q2.setCacheable(true);
//	    a = (Alien)q2.uniqueResult();
//	    System.out.println(a);	    
//	    session1.close();
//	    session2.close();
    	
//    	hql
//      Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
//      ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//      SessionFactory sf = con.buildSessionFactory(reg);
//      Session session = sf.openSession();
//      Transaction tx = session.beginTransaction();  
    	
//      Random r = new Random();
//      for (int i = 0; i < 50; i++) {    	  
//    	  Student s = new Student();
//    	  s.setRollno(i);
//    	  s.setName("Name" + i);
//    	  s.setMarks(r.nextInt(100));
//    	  session.save(s);
//      }      
//      Query q = session.createQuery("from Student where marks > 50"); // select * from students
//      List<Student> students = q.list();
//      for (Student s : students) {
//    	  System.out.println(s);
//      }
//      Query q = session.createQuery("select rollno, name, marks from Student"); // select * from students
//      List<Object[]> students = q.list();
//      for (Object [] student: students) {
//    	  for (Object o : student) {
//        	  System.out.println(o);
//          }
//      }
//      Query q = session.createQuery("from Student where rollno = 7"); // select * from students
//      Student student = (Student) q.uniqueResult();
//      System.out.println(student);
//      Query q = session.createQuery("select rollno, name, marks from Student where rollno = 7");
//      Object[] student = (Object[]) q.uniqueResult();
//      for (Object o : student) {
//    	  System.out.println(o);
//      }       
//      Query q = session.createQuery("select sum(marks) from Student");
//      long mark = (Long) q.uniqueResult();
//      System.out.println(mark);
//      int threshold = 70;
//      Query q = session.createQuery("select sum(marks) from Student where marks > :threshold");
//      q.setParameter("threshold", threshold);
//      long mark = (Long) q.uniqueResult();
//      System.out.println(mark);    
//      tx.commit();
      
//      sql
//      SQLQuery q = session.createSQLQuery("select * from Student where marks > 70");
//      must add this
//      q.addEntity(Student.class);
//      List<Student> students = q.list();
//      for (Student s : students) {
//    	  System.out.println(s);
//      }

//	    SQLQuery q = session.createSQLQuery("select name, marks from Student where marks > 70");
//	    this is key-value pair
//	    q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//	    List<Student> students = q.list();
//	    for (Object o : students) {
//	  	  Map m = (Map)o;
//	  	  System.out.println(m.get("name") + " : " + m.get("marks"));
//	    }            
//      tx.commit();
      
//      Persistence
//      Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
//      ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//      SessionFactory sf = con.buildSessionFactory(reg);
//      Session session = sf.openSession();
//      Transaction tx = session.beginTransaction();
      
//      Laptop l = new Laptop();
//      l.setLid(1);
//      l.setBrand("Sony");
//      l.setPrice(700);      
//      session.save(l);
//      l.setPrice(650); // this updated to database
      
//      l.setLid(2);
//      l.setBrand("Lenovo");
//      l.setPrice(800);
//      session.save(l);
//      l.setPrice(650);
//      remove
//      session.delete(l);      
      
//      tx.commit();
//      detach
//      session.evict(l);
//      l.setPrice(600);
      
//      get vs load
//      l = (Laptop) session.get(Laptop.class, 1);
//      Thread.sleep(3000);
//      System.out.println(l);
//      Proxy
//      l = (Laptop) session.load(Laptop.class, 1);
//      Thread.sleep(3000);
//      System.out.println(l);
//      notFound
//      l = (Laptop) session.get(Laptop.class, 1000);
//      System.out.println(l);
//      l = (Laptop) session.load(Laptop.class, 1000);
      
    }
}
