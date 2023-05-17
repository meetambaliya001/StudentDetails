/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;
import java.util.Scanner;
/**
 *
 * @author srinivsi
 */
public class PrintStudentDetails {

    /** user interactions - view class
     * to print 3 student details - name , age,stId
     * @param args
     */
    public static void main(String[] args)
    {
      Student[] list = new Student[3] ;  //array of object decalration
      //define 3 students  by creating object of student class
        Scanner in = new Scanner(System.in); 
                for(int i=0;i<list.length;i++)
                {
                String n = in.next();
                int a = in.nextInt();
                Student s1 = new Student (n,a);
                list[i]=s1;
                
                }
                
                for (int i=0;i<list.length;i++)
                {
                
                }
                
    }
    
}
