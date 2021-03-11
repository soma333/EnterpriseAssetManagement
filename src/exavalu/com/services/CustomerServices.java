/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.services;

import exavalu.com.beans.Customer;
import exavalu.com.beans.Policy;
import exavalu.com.utilities.ConnectionProviderToDB;
import exavalu.com.utilities.DbParamsProvider;
import exavalu.com.utilities.PropertiesReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class CustomerServices {
    
    
    public static boolean createCustomers(Customer customer) throws Exception
    {
        
        
        try {
                DbParamsProvider db_ParamProvider= PropertiesReader.readProperties();
                
                Class.forName(db_ParamProvider.getDriver());

                Connection con=DriverManager.getConnection(db_ParamProvider.getDbUrl()+db_ParamProvider.getDbName(),db_ParamProvider.getUserName(),db_ParamProvider.getPassword()); 
                Statement stmt = con.createStatement();
                Statement stm = con.createStatement();
            
                int st1=customer.getC_id();
                String st2=customer.getC_name();
                String st3=customer.getOccupation();
                int st4=customer.getAge();
                String st5=customer.getGender();
                double st6=customer.getAnnualIncome();
                
            
                stmt.executeUpdate("insert into customer values(" + st1 + "," + "'" + st2 + "'"+  "," + "'" + st3 + "'" +","  +st4 + "," + "'" + st5 + "'"+ ","+st6 +");");
                //stmt.executeUpdate("insert into customer values(" + st1 + "," + "'" + st2 + "'"+  "," + "'" + st3 + "'" +","  +st4 + "," + "'" + st5 + "'"+ ","+st6 +");");
            
                
                System.out.println(" Customer Inserted successfully");

            con.close();

 

        } 
        catch (Exception e) {

            System.out.println("Driver classpath not set::"+e);

        }

        PropertiesReader.readProperties();
        
        return true;    
    
        
    }
    
    
    public static boolean deleteCustomers(int a) throws Exception
    {
        
        
        try {
                DbParamsProvider db_ParamProvider= PropertiesReader.readProperties();
                
                Class.forName(db_ParamProvider.getDriver());

                Connection con=DriverManager.getConnection(db_ParamProvider.getDbUrl()+db_ParamProvider.getDbName(),db_ParamProvider.getUserName(),db_ParamProvider.getPassword()); 
                Statement stmt = con.createStatement();
                Statement stm = con.createStatement();
            
                int b=a;
            
                stmt.executeUpdate("delete from customer where idcustomer="+b+" ;");
                
                
                System.out.println("Customer Deleted successfully");

            con.close();

 

        } 
        catch (Exception e) {

            System.out.println("Driver classpath not set::"+e);

        }

        PropertiesReader.readProperties();
        
        return true;    
    
        
    }
    
    
    public static boolean createPolicy(Policy policy) throws Exception
    {
        
        
        try {
                Connection con=ConnectionProviderToDB.getConnection();
                PreparedStatement stmt=con.prepareStatement("insert into policy values(?,?,?,?,?,?,?,?)");
   
                int st1=policy.getP_id();
                String st2=policy.getP_name();
                String st3=policy.getExp_date();
                String st4=policy.getLaunch_date();
                double st5=policy.getPremium_amt();
                double st6=policy.getCoverage();
                int st7=policy.getMinAgeOfOffering();
                int st8=policy.getMaxAgeOfOffering();
                
                stmt.setInt(1,st1);
                stmt.setString(2,st2);
                stmt.setString(3,st3);
                stmt.setString(4,st4);
                stmt.setDouble(5, st5);
                stmt.setDouble(6, st6);
                stmt.setInt(7,st7);
                stmt.setInt(8,st8);
                
                int i=stmt.executeUpdate();
                System.out.println("Policy inserted successfully");

            con.close();

 

        } 
        catch (Exception e) {

            System.out.println("Driver classpath not set::"+e);

        }

        PropertiesReader.readProperties();
        
        return true;    
    
        
    }
    
    public static boolean deletePolicy(int a) throws Exception
    {
        
        
                Connection con=ConnectionProviderToDB.getConnection();
                Statement stmt = con.createStatement();  
                int b=a;
            
                stmt.executeUpdate("delete from policy where idPolicy="+b+" ;");
                
                
                System.out.println("Policy Deleted successfully");

            con.close();

 

        

        PropertiesReader.readProperties();
        
        return true;    
    
        
    }
    
}
