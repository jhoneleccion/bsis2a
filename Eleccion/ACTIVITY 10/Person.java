/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity10.pkg11.pkg6.pkg1.extendingstudentrecord;

/**
 *
 * @author asus
 */
public class Person{
    protected String name;
    protected String address;
    protected String email;
    protected Integer telephone;
/**
* Default constructor
*/
    public Person(){
        
    System.out.println("Jhon");
    System.out.println("Iloilo");
    System.out.println("jhon@gmai.com");
    System.out.println("66282833");
    name= "";
    address = "";
    email = "";
   
    
    }
/**
* Constructor with 2 parameters
*/
    public Person( String name, String address, String email, Integer telephone ){
    this.name = name;
    this.address = address;
    this.email = email;
  
   
    }
/**
* Accessor methods
*/  

    public String getName(){
    return name;
    }
    public String getAddress(){
    return address;
    }
    public String getEmail(){
    return email;
    }
    public Integer getTelephone(){
    return telephone;
    }
    
    public void setName( String name ){
    this.name = name;
     }
    public void setAddress( String add ){
    this.address = add;
}
    public void setEmail( String eml ){
    this.email = email;
     }
    public void setTelephone( Integer Tel ){
    this.telephone = telephone;
     }
    
    
    
    public class Student extends Person
    {
        
    private Student(){
    System.out.println("djdd");
    
    
    
    
  
    }
    

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Person studentrecord = new Person();
        
        //Person add = new Person();
        //Person eml = new Person();
        //Person tel= new Person();
       
        
        
        
        
        
        
        
      
        
        
        
        
        
    }
    
}
