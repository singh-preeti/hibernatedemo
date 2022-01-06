package com.task;
  
import javax.persistence.*;  
  
@Entity  
 public class Employee {    
      
@Id  
   
//@PrimaryKeyJoinColumn  
private int employeeId;    
private String name,email;    
@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  

private Address address;  
public int getEmployeeId() {  
    return employeeId;  
}  
public void setEmployeeId(int employeeId) {  
    this.employeeId = employeeId;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public Address getAddress() {  
    return address;  
}  
public void setAddress(Address address) {  
    this.address = address;  
}    
  
}    