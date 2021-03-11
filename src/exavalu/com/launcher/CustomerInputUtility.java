/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.launcher;

import exavalu.com.beans.Address;
import exavalu.com.beans.Contact;
import exavalu.com.beans.Customer;
import exavalu.com.beans.Policy;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CustomerInputUtility {

    public static Customer getCustomerInput() 
    {
        Scanner sc=new Scanner(System.in);
        Customer cus=new Customer();
        System.out.println("Enter customer Id          : ");
        int cid=sc.nextInt();
        cus.setC_id(cid);
        
        System.out.println("Enter customer_Name        : ");
        String cName=sc.next();
        cus.setC_name(cName);
        
        Address ad1=new Address();
        System.out.println("Enter customer addressline1: ");
        String add1=sc.next();
        ad1.setAddressLine1(add1);
        
        System.out.println("Enter customer addressline2: ");
        String add2=sc.next();
        ad1.setAddressLine2(add2);
        
        System.out.println("Enter customer city        : ");
        String ct=sc.next();
        ad1.setCity(ct);
        
        System.out.println("Enter customer state       : ");
        String st=sc.next();
        ad1.setState(st);
        
        System.out.println("Enter customer country     : ");
        String cy=sc.next();
        ad1.setCountry(cy);
        
        System.out.println("Enter customer pincode     : ");
        String pc=sc.next();
        ad1.setPinCode(pc);
        cus.setC_address(ad1);
            
            
        Contact con1= new Contact();
        System.out.println("Enter customer phone_no    : ");
        String ph=sc.next();
        con1.setPh_no(ph);
            
        System.out.println("Enter customer email_id    : ");
        String eid=sc.next();
        con1.setEmail_add(eid);
        cus.setC_phno(con1);
            
            
        System.out.println("Enter customer occupation  : ");
        String co=sc.next();
        cus.setOccupation(co);
            
            
        System.out.println("Enter customer age         : ");
        int a=sc.nextInt();
        cus.setAge(a);
            
            
        System.out.println("Enter customer gender      : ");
        String gen=sc.next();
        cus.setGender(gen);
            
            
        System.out.println("Enter customer ann. income : ");
        double inc=sc.nextDouble();
        cus.setAnnualIncome(inc);
        System.out.println();
        
        return cus;
        }
    
    
    public static int getDeleteCustomerInput() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer_id to delete :");
        int i=sc.nextInt();
        return i;
    }
    
    
    public static Policy createPoliciesInput()
    {
        
            Scanner sc=new Scanner(System.in);
            
            Policy pcy=new Policy();
            System.out.println("Enter policy pId           : ");
            int pid=sc.nextInt();
            pcy.setP_id(pid);
            
            System.out.println("Enter policy policy_Name   : ");
            String pName=sc.next();
            pcy.setP_name(pName);
            
            System.out.println("Enter policy exp_date      : ");
            String expd=sc.next();
            pcy.setExp_date(expd);
            
            System.out.println("Enter policy lch_date      : ");
            String lchdate=sc.next();
            pcy.setLaunch_date(lchdate);
            
            System.out.println("Enter policy prim_amt      : ");
            double pmt=sc.nextDouble();
            pcy.setPremium_amt(pmt);
            
            System.out.println("Enter policy coverage      : ");
            double cvg=sc.nextDouble();
            pcy.setCoverage(cvg);
            
            System.out.println("Enter policy minAgeOffering: ");
            int min=sc.nextInt();
            pcy.setMinAgeOfOffering(min);
            
            System.out.println("Enter policy maxAgeOffering: ");
            int max=sc.nextInt();
            pcy.setMaxAgeOfOffering(max);
                   
        return pcy;
        
    }
    
    public static int getDeletePolicyInput() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Policy_id to delete :");
        int i=sc.nextInt();
        return i;
    }
    

    
}
