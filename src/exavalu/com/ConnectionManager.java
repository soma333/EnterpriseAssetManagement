package exavalu.com;

import exavalu.com.utilities.DbParamsProvider;
import exavalu.com.utilities.PropertiesReader;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ConnectionManager {

/*

    public static void main(String args[]) throws FileNotFoundException, Exception {

        try {
                DbParamsProvider db_ParamProvider= PropertiesReader.readProperties();
                //PropertiesReader.readProperties();
                Class.forName(db_ParamProvider.getDriver());

                Connection con=DriverManager.getConnection(db_ParamProvider.getDbUrl()+db_ParamProvider.getDbName(),db_ParamProvider.getUserName(),db_ParamProvider.getPassword()); 

//step3 create the statement object 

            Statement stmt = con.createStatement();
            Statement stm = con.createStatement();
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter the customer_id       :");
            int st1=sc.nextInt();
            
            System.out.println("Enter the customer_location :");
            String st4=sc.next();
            stmt.executeUpdate("UPDATE customer SET customer_location='"+st4+"' WHERE customer_id ="+st1);
            
            

            con.close();

 

        } 
        catch (Exception e) {

            System.out.println("Driver classpath not set::"+e);

        }

        PropertiesReader.readProperties();

    }

 
*/
}

