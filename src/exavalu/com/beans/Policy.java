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
public class Policy {
    private int       p_id;
    private String    p_name;
    private String    exp_date;
    private String    launch_date;
    private double    premium_amt;
    private double    coverage;
    private int       minAgeOfOffering;
    private int       maxAgeOfOffering;

    /**
     * @return the p_id
     */
    public int getP_id() {
        return p_id;
    }

    /**
     * @param p_id the p_id to set
     */
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    /**
     * @return the p_name
     */
    public String getP_name() {
        return p_name;
    }

    /**
     * @param p_name the p_name to set
     */
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    /**
     * @return the exp_date
     */
    public String getExp_date() {
        return exp_date;
    }

    /**
     * @param exp_date the exp_date to set
     */
    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    /**
     * @return the launch_date
     */
    public String getLaunch_date() {
        return launch_date;
    }

    /**
     * @param launch_date the launch_date to set
     */
    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    /**
     * @return the premium_amt
     */
    public double getPremium_amt() {
        return premium_amt;
    }

    /**
     * @param premium_amt the premium_amt to set
     */
    public void setPremium_amt(double premium_amt) {
        this.premium_amt = premium_amt;
    }

    /**
     * @return the coverage
     */
    public double getCoverage() {
        return coverage;
    }

    /**
     * @param coverage the coverage to set
     */
    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    /**
     * @return the minAgeOfOffering
     */
    public int getMinAgeOfOffering() {
        return minAgeOfOffering;
    }

    /**
     * @param minAgeOfOffering the minAgeOfOffering to set
     */
    public void setMinAgeOfOffering(int minAgeOfOffering) {
        this.minAgeOfOffering = minAgeOfOffering;
    }

    /**
     * @return the maxAgeOfOffering
     */
    public int getMaxAgeOfOffering() {
        return maxAgeOfOffering;
    }

    /**
     * @param maxAgeOfOffering the maxAgeOfOffering to set
     */
    public void setMaxAgeOfOffering(int maxAgeOfOffering) {
        this.maxAgeOfOffering = maxAgeOfOffering;
    }

    
}
