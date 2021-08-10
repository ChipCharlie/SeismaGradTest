package com.company;
/*
* Written by Charles Liao
* */

public class Payroll {

    private String firstName;
    private String lastName;
    private int annualSalary;
    private int superRate;
    private int dateStart;
    /* *
    * @param firstName
    * @param lastName
    * @param annualSalary
    * @param superRate
    * @param dateStart
    * */
    public Payroll(String firstName, String lastName, int annualSalary,
                   int superRate, int dateStart){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
        this.dateStart = dateStart;
    }
    /* * @return the firstName  */
    public String getFirstName() {
        return firstName;
    }
    /* @param firstName the firstName to set*/
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /* @return the lastName */
    public String getLastName(){
        return lastName;
    }
    /* @param lastName the lastName to set*/
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAnnualSalary(){
        return annualSalary;
    }
    public void setAnnualSalary(){
        this.annualSalary = annualSalary;
    }
    /* @return the superRate */
    public int getSuperRate(){
        return superRate;
    }
    /* @param superRate the superRate to set*/
    public void setSuperRate(int superRate){
        this.superRate = superRate;
    }
    /* @return the dateStart */
    public int getDateStart(){
        return dateStart;
    }
    /* @param dateStart the dateStart to set*/
    public void setDateStart(int dateStart){
        this.dateStart = dateStart;
    }

    @Override
    public String toString(){
        return "Payroll [Name = " + firstName + " " + lastName + ", Salary = " + annualSalary + ", Super = "
                + superRate + ", Date start: " + dateStart + "]";
    }

}
