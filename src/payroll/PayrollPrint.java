/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
    
public static void main(String[] args) 
{
    String emp=null;
    double Sal=0.0;
/* here assumed that 50 employee accounts can be created
 for the given bank */
Payroll out;
out= new Payroll(Sal, emp);
Payroll ac[]=new Payroll[50];
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the employee name:" );
emp=sc.next();
//add code
System.out.println("Please enter the salary: salary <=3000");
Sal=sc.nextDouble();
System.out.println("The final Salary including bonus is: " +out.CalcSalary());         

}

}
