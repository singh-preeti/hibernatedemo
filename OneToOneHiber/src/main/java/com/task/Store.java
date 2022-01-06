package com.task;

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    
    
public class Store {    
public static void main(String[] args) {    
      
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();   
      
    Employee e1=new Employee();   
    e1.setEmployeeId(103);
    e1.setName(" Netha");    
    e1.setEmail("ravali@gmail.com");    
        
    Address address1=new Address();  
    address1.setAddressId(4);
    address1.setAddressLine1("SD-500,naspur");    
    address1.setCity("Hyd");    
    address1.setState("telangana");    
    address1.setCountry("India");    
    address1.setPincode(600000);    
        
    e1.setAddress(address1);    
    address1.setEmployee(e1);    
        
    session.persist(e1);    
    t.commit();    
        
    session.close();    
    System.out.println("success");    
}    
}    