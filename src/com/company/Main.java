package com.company;
import sun.font.EAttribute;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String inputFile = "testinput.txt";
        String outputFile = "testoutput.txt";

        //Load Payroll from input file
        List<Payroll> payrolls = readInputFromCSV(inputFile);

        //Load Payslips to output file
//        List<Payslip> payslips = writeCSVtoOutput(outputFile);
        List<Payslip> payslips = new ArrayList<>();
//        Payslip payslip = createPayslip();



    }

    private static List<Payroll> readInputFromCSV(String fileName) {
        List<Payroll> payrolls = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
         try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
             // read the first line from the text file
              String line = br.readLine();
              // loop until all lines are read
              while (line != null) {
                  // use string.split to load a string array with the values from
                  // each line of the file, using a comma as the delimiter
                   String[] attributes = line.split(",");
                   Payroll payroll = createPayroll(attributes);
                   // adding book into ArrayList
                   payrolls.add(payroll);
                  // read next line before looping
                  // if end of file reached, line would be null
                   line = br.readLine();
              }
         } catch (IOException ioe) {
             System.out.println("Something went wrong with the reader.");
             ioe.printStackTrace();
         }
         return payrolls;
    }

    private static int Taxrate(int annualSalary){
        double incomeTax = 0;
        int taxBracket = 0;
        //Set tax thresholds
        int limit1 = 18200;
        int limit2 = 37000;
        int limit3 = 87000;
        int limit4 = 180000;
        //Check for tax brackets
        taxBracket = annualSalary > 0 && annualSalary <= limit1 ? 1 : taxBracket;
        taxBracket = annualSalary > limit1 && annualSalary <= limit2 ? 2 : taxBracket;
        taxBracket = annualSalary > limit2 && annualSalary <= limit3 ? 3 : taxBracket;
        taxBracket = annualSalary > limit3 && annualSalary <= limit4 ? 4 : taxBracket;
        taxBracket = annualSalary > limit4 ? 5 : taxBracket;
        //Set conditional, case-switch only works with non-booleans

        switch (taxBracket){
            case 1:
                incomeTax = 0;
            case 2:
                incomeTax = (annualSalary - limit1) * 0.19;
            case 3:
                incomeTax = 3572 + (annualSalary - limit2) * 0.325;
            case 4:
                incomeTax = 19822 + (annualSalary - limit3) * 0.37;
            case 5:
                incomeTax = 54232 + (annualSalary - limit4) * 0.45;
        }
        int iTax = (int) Math.ceil(incomeTax);
        return iTax;
    }


//    private static List<Payslip> writeCSVtoOutput(String fileName){
//        List<Payslip> payslips = new ArrayList<>();
////        Path pathToFile = Paths.get(fileName);
//
//        try(FileWriter fw = new FileWriter(fileName)) {
//
//            while (payrolls != null) {
//                // use string.split to load a string array with the values from
//                // each line of the file, using a comma as the delimiter
//                String[] attributes = line.split(",");
//                Payroll payroll = createPayroll(attributes);
//                // adding book into ArrayList
//                payrolls.add(payroll);
//                // read next line before looping
//                // if end of file reached, line would be null
//                line = br.readLine();
//            }
//            String line = br.readLine();
//
//            String[] attributes = line.split(",");
//            Payslip payslip = createPayslip();
//
//            payslips.add(payslip);
//
////            fw.close();
//        } catch (IOException ioe){
//            System.out.println("Something went wrong with the writer.");
//            ioe.printStackTrace();
//        } finally {
//            fw.close();
//        }
//
//
//        return payslips;
//    }


    private static Payroll createPayroll(String[] metadata) {
        String firstName = metadata[0];
        String lastName = metadata[1];
        int annualSalary = Integer.parseInt(metadata[2].trim());
        int superRate = Integer.parseInt(metadata[3].trim());
        int dateStart = Integer.parseInt(metadata[4].trim());
        // create and return book of this metadata
        return new Payroll(firstName, lastName, annualSalary, superRate, dateStart);
    }

//    private static Payslip createPayslip() {
////        String fullName = metadata[0];
////        int payPeriod = Integer.parseInt(metadata[1].trim());
////        int grossIncome = Integer.parseInt(metadata[2].trim());
////        int incomeTax = Integer.parseInt(metadata[3].trim());
////        int netIncome = Integer.parseInt(metadata[4].trim());
////        int superPaid = Integer.parseInt(metadata[5].trim());
//        // create and return book of this metadata
////        return new Payslip(String fullName, payPeriod, grossIncome, incomeTax, netIncome, superPaid);
//    }

}
