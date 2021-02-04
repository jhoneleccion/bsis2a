/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class AddressBook1 {

    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> address = new ArrayList<>();
    static ArrayList<String> email = new ArrayList<>();
    static ArrayList<Integer> telephone = new ArrayList<>();
    
    static Scanner ton = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int option =0;
        end:
        
        while(true) {
            System.out.println("Options: \n1. Add entry \n2. Delete entry \n3. View entry \n4. Update entry \n0. exit");
            option = ton.nextInt();
            switch (option) {
                case 1:
                    AddEntry();
                    break;
                case 2:
                    DeleteEntry();
                    break;
                case 3:
                    ViewEntry();
                    break;
                case 4:
                    UpdateEntry();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("INVALID");
                    break;
            }
        }
    }
    static void AddEntry() {
        System.out.print("Enter Name: ");
        name.add(ton.next());
        System.out.print("Enter Address: ");
        name.add(ton.next());
        System.out.print("Enter Email: ");
        name.add(ton.next());
        System.out.print("Enter Telephone: ");
        telephone.add(ton.nextInt());
    }
    
     static void DeleteEntry() {
        System.out.print("Enter name to delete: ");
        name.remove(ton.next());
      
    }

    
    static void ViewEntry() {
        System.out.println("Persons you have entered ");
            for(int i=0; i<name.size();i++){
                
            System.out.println(name.get(i)+ address.get(i)+ email.get(i)+ telephone.get(i));   
                     
        }
    }

    static void UpdateEntry() {
        System.out.print("Enter Index: ");
        int index = ton.nextInt();
        
        System.out.print("Enter New Name: ");
        String newname = ton.next();
        System.out.print("Enter New Address: ");
        String newaddress = ton.next();
        System.out.print("Enter New Email: ");
        String newemail = ton.next();
        System.out.print("Enter New Telephone: ");
        int newtelephone= ton.nextInt();
        
        name.set(index,newname);
        address.set(index,newaddress);
        email.set(index,newemail);
        telephone.set(index,newtelephone);
        
        
        }
     
    
    }
   
