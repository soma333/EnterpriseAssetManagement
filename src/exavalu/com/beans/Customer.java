/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.beans;

/**
 *
 * @author DELL
 */
public class Customer {
    private int       c_id;
    private String    c_name;
    private Address   c_address;
    private Contact   c_phno;
    private String    occupation;
    private int       age;
    private String    gender;
    private double    annualIncome;

    /**
     * @return the c_id
     */
    public int getC_id() {
        return c_id;
    }

    /**
     * @param c_id the c_id to set
     */
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    /**
     * @return the c_name
     */
    public String getC_name() {
        return c_name;
    }

    /**
     * @param c_name the c_name to set
     */
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    /**
     * @return the c_address
     */
    public Address getC_address() {
        return c_address;
    }

    /**
     * @param c_address the c_address to set
     */
    public void setC_address(Address c_address) {
        this.c_address = c_address;
    }

    /**
     * @return the c_phno
     */
    public Contact getC_phno() {
        return c_phno;
    }

    /**
     * @param c_phno the c_phno to set
     */
    public void setC_phno(Contact c_phno) {
        this.c_phno = c_phno;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the annualIncome
     */
    public double getAnnualIncome() {
        return annualIncome;
    }

    /**
     * @param annualIncome the annualIncome to set
     */
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    
    
}
