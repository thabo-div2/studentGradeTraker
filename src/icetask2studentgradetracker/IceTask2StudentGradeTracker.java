/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask2studentgradetracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class IceTask2StudentGradeTracker
{

    //------------------------------------------------------------------------//
    // This is the main method
    public static void main(String[] args)
    {
       int FINISH = 5;
       int option;
       String studentName;
       String searchedStudent;
       float studentMark;
       float marks = 0;
       float average = 0;
       Scanner scanner = new Scanner(System.in);
       boolean runProgram = true;
       List<String> studentNames = new ArrayList<String>();
       List<Float> studentMarks = new ArrayList<Float>();
       System.out.println("Welcome to the Student Grade Tracker!");
       
       while(runProgram == true)
       {
           System.out.println("What would you like to do?");
           System.out.println("1. Add a new student and grade");
           System.out.println("2. Display list of students and their grades");
           System.out.println("3. Calculate average grade for the subject");
           System.out.println("4. Search for a student and display their grade");
           System.out.println("5. Exit");
           System.out.println("Enter your option: ");
           
           option = scanner.nextInt();
           
           if(option == 1)
           {
               System.out.println("Enter student's name: ");
               studentName = scanner.next();
               studentNames.add(studentName);
               
               System.out.println("Enter student's mark: ");
               studentMark = scanner.nextInt();
               studentMarks.add(studentMark);
               
               System.out.println(studentName + "'s grade has been added successfully.");
           } else if (option == 2) 
           {
               System.out.println("List of students and their grades: ");
               for(String sName: studentNames) 
               {
                   for(Float sMark: studentMarks)
                   {
                       System.out.println(sName + " " + sMark);
                   }
               }
           } else if (option == 3) 
           {
               
               if(!studentMarks.isEmpty() || !studentNames.isEmpty()) 
               {
                   for (float sMark: studentMarks) {
                       marks += sMark;
                   }
                   
                   average = marks / studentMarks.size();
               }
               
               System.out.println("Average grade for the subject: " + average);
           } else if (option == 4) 
           {
               System.out.println("Enter student's name to search: ");
               searchedStudent = scanner.next();
               
               if(studentNames.contains(searchedStudent)){
                   int i = studentNames.indexOf(searchedStudent);
                   float m = studentMarks.get(i);
                   System.out.println(searchedStudent + " - " + m);
               }
               
           } else if (option == 5) 
           {
               if (option == FINISH)
               {
                   runProgram = false;
               }
           }
       }
       
    }
    
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
