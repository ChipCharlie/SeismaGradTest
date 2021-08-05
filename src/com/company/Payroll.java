package com.company;
/*
* Written by Charles Liao
* */

public class Payroll {

    private String firstName;
    private String lastName;
    private int annualSalary;
    private String superRate;
    private String dateStart;
    /* *
    * @param firstName
    * @param lastName
    * @param annualSalary
    * @param superRate
    * @param dateStart
    * */
    public Payroll(String firstName, String lastName, int annualSalary,
                   String superRate, String dateStart){
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
    public String getSuperRate(){
        return superRate;
    }
    /* @param superRate the superRate to set*/
    public void setSuperRate(String superRate){
        this.superRate = superRate;
    }
    /* @return the dateStart */
    public String getDateStart(){
        return dateStart;
    }
    /* @param dateStart the dateStart to set*/
    public void setDateStart(String dateStart){
        this.dateStart = dateStart;
    }

    @Override
    public String toString(){
        return "Payroll [Name = " + firstName + " " + lastName + ", Salary = " + annualSalary + ", Super = "
                + superRate + ", Date start: " + dateStart + "]";
    }

}
