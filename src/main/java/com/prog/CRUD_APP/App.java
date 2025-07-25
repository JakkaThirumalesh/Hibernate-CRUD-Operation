package com.prog.CRUD_APP;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        Session session = factory.openSession();
        
        //student created and saved(insertion and commit)
//        Student st1 = new Student();
//        st1.setName("Sagar");
//        st1.setEmail("sagar@gmail.com");
//        st1.setAddress("Bhiwandi");
//        st1.setCollegeName("BNN");       
//        Transaction tx = session.beginTransaction();
//        session.save(st1);
//        tx.commit();
//        System.out.println("Student Register Successfully");
        
//      //select * from Student
        //get all data
//        List<Student> list = session.createQuery("from Student", Student.class).list();
//        list.forEach(e->System.out.println(e));
        
        //select * from Student where id = 2;
        //get by id
        Student getById = session.get(Student.class, 2);
        System.out.println(getById);
        
        //update Student set ?,?,?,? where id = 1;
        //update with id
//        Student st1 = session.get(Student.class, 1);
//        st1.setName("Aman");
//        st1.setEmail("aman@gmail.com");
//        st1.setAddress("Bhiwandi");
//        st1.setCollegeName("BNN");
//        Transaction tx = session.beginTransaction();
//        session.save(st1);
//        tx.commit();
//        System.out.println("data updated");
        
        //delete by id
//        Student st1 = session.get(Student.class, 4);
//        Transaction tx = session.beginTransaction();
//        session.delete(st1);
//        tx.commit();
//        System.out.println("Data Deleted Successfully");     
        
        session.close();
        factory.close();
    }
}
