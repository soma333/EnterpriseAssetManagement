/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.utilities;

/**
 *
 * @author DELL
 */
import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author DELL
 */
public class PropertiesReader {
    public static DbParamsProvider readProperties() throws Exception
    {
        DbParamsProvider db_ParamProvider=new DbParamsProvider();
        //now read the property file and extract the properties 
        //to set into Db_ParamProvider class
        
         FileReader reader=new FileReader("G:config/db_params.properties");  
      
    Properties p=new Properties();  
          
            p.load(reader);
        

        
      
    db_ParamProvider.setDriver(p.getProperty("driver"));  
    db_ParamProvider.setDbUrl(p.getProperty("db_url"));
    db_ParamProvider.setDbName(p.getProperty("db_name"));  
    db_ParamProvider.setUserName(p.getProperty("user_name"));
    db_ParamProvider.setPassword(p.getProperty("password"));  
        
      return db_ParamProvider;
    }
    
}

