/*
 * To change applicant license header, choose License Headers in Project Properties.
 * To change applicant template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_dimas;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Kuis_dimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person applicant = new Person();
        String position;
        double  division, option = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("JOB PROGRAM");
        System.out.println("Choose Division");
        System.out.println("1. Web");
        System.out.println("2. Mobile");
        System.out.print("Division: ");
        division = sc.nextDouble();
        if(division == 1){
            System.out.println("\nChoose Position");
            System.out.println("1. FrontEnd");
            System.out.println("2. BackEnd");
            System.out.print("Position : ");
            position = sc.next();
            if(position == "FrontEnd" || position == "1"){
                applicant.codingWeight = 0.2;
                applicant.writeWeight = 0.5;
                applicant.interviewWeight = 0.3;
            }else{
                applicant.codingWeight = 0.5;
                applicant.writeWeight = 0.2;
                applicant.interviewWeight = 0.3;
            }
        }else{
            applicant.codingWeight = 0.5;
            applicant.writeWeight = 0.25;
            applicant.interviewWeight = 0.25;
        }
        System.out.println("\nParticipant Data");
        System.out.print("NIK : ");
        applicant.nik = sc.next();
        System.out.print("Name : ");
        sc.hasNext();
        applicant.name = sc.nextLine();
        applicant.name += sc.nextLine();
        
        while(option == 1){
            System.out.print("Written Test : ");
            applicant.writtenTest = sc.nextDouble();
            System.out.print("Coding Test : ");
            applicant.codingTest = sc.nextDouble();
            System.out.print("Interview Test : ");
            applicant.interviewTest = sc.nextDouble();
            applicant.result = (applicant.getWrite() + applicant.getCoding() + applicant.getInterview());
            if(applicant.result>=85){
                applicant.status = "Passed"; 
            }else{
                applicant.status = "Failed";
            }
            System.out.println("Option");
            System.out.println("1. Edit Data");
            System.out.println("2. See Status");
            System.out.print("Option: ");
            option = sc.nextDouble();
            if(option == 2){
                System.out.println("Your Status is : " + applicant.status);
            }
        }
        System.out.println("\nResult");
        System.out.println("Applicant Name : " + applicant.name);
        System.out.println("Applicant Final Score : " + applicant.result);
        System.out.println("Applicant Status : " + applicant.status);
    }
}
