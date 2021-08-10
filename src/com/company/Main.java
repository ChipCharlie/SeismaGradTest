package com.company;
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

//        String fileName = System.getProperty("user.home")+"/payroll.csv";
        List<Payroll> payrolls = readInputFromCSV("testinput.txt");

        for (Payroll i:payrolls){
            System.out.println(i);
        }


        //Payroll is input class

        //Payslip is output class


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
             System.out.println("Something went wrong.");
             ioe.printStackTrace();
         }
         return payrolls;
    }


    private static Payroll createPayroll(String[] metadata) {
        String firstName = metadata[0];
        String lastName = metadata[1];
        int annualSalary = Integer.parseInt(metadata[2].trim());
        String superRate = metadata[3];
        int dateStart = Integer.parseInt(metadata[4].trim());
        // create and return book of this metadata
        return new Payroll(firstName, lastName, annualSalary, superRate, dateStart);
    }


}
