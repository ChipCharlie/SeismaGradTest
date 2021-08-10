package com.company;
/*
 * Written by Charles Liao
 * */

public class Payslip {

    private String fullName;
    private int payPeriod;
    private int grossIncome;
    private int incomeTax;
    private int netIncome;
    private int superPaid;

    /* *
     * @param fullName
     * @param payPeriod
     * @param grossIncome
     * @param incomeTax
     * @param netIncome
     * @param superPaid
     * */
    public Payslip(String fullName, int payPeriod, int grossIncome,
                   int incomeTax, int netIncome, int superPaid){
        super();
        this.fullName = fullName;
        this.payPeriod = payPeriod;
        this.grossIncome = grossIncome;
        this.incomeTax = incomeTax;
        this.netIncome = netIncome;
        this.superPaid = superPaid;

    }
    /* * @return the fullName  */
    public String getFullName() {
        return fullName;
    }
    /* @param fullName the fullName to set*/
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    /* @return the payPeriod */
    public int getPayPeriod(){
        return payPeriod;
    }
    /* @param payPeriod the payPeriod to set*/
    public void setPayPeriod(int payPeriod){
        this.payPeriod = payPeriod;
    }
    /* @return the grossIncome */
    public int getGrossIncome(){
        return grossIncome;
    }
    /* @param grossIncome the grossIncome to set*/
    public void setGrossIncome(){
        this.grossIncome = grossIncome;
    }

    /* @return the incomeTax */
    public int getIncomeTax(){
        return incomeTax;
    }
    /* @param incomeTax the incomeTax to set*/
    public void setIncomeTax(){
        this.incomeTax = incomeTax;
    }
    /* @return the netIncome */
    public int getNetIncome(){
        return netIncome;
    }
    /* @param netIncome the netIncome to set*/
    public void setNetIncome(){
        this.netIncome = netIncome;
    }
    /* @return the superPaid */
    public int getSuperPaid(){
        return superPaid;
    }
    /* @param superPaid the superPaid to set*/
    public void setSuperPaid(int superPaid){
        this.superPaid = superPaid;
    }

    @Override
    public String toString(){
        return "Payslip [Name = " + fullName + ", Pay Period = " + payPeriod +
                ", Gross = " + grossIncome + ", Income Tax: " + incomeTax +
                ", Net = " + netIncome + ", Super = " + superPaid + "]";
    }

}
