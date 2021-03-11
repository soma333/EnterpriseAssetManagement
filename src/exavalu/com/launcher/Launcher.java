/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.launcher;

import exavalu.com.beans.Customer;
import exavalu.com.beans.Policy;
import exavalu.com.services.CustomerServices;

/**
 *
 * @author DELL
 */
public class Launcher {
    public static void main(String args[]) throws Exception
    {
        //Customer customer =CustomerInputUtility.getCustomerInput();
        //boolean success=CustomerServices.createCustomers(customer);
        
        //int a=CustomerInputUtility.getDeleteCustomerInput();
        //boolean success1=CustomerServices.deleteCustomers(a);
        
        Policy policy=CustomerInputUtility.createPoliciesInput();
        boolean success2=CustomerServices.createPolicy(policy);
        
        //int b=CustomerInputUtility.getDeletePolicyInput();
        //boolean success3=CustomerServices.deletePolicy(b);
    }
    
}
