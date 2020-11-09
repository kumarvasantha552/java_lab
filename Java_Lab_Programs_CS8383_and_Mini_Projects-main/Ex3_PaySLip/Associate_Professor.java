/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3_PaySLip;

/**
 *
 * 
 */
import java.util.*;
class Associate_Professor extends Employee
{
    double BP,Gross_salary,Net_salary;
    public Associate_Professor(int id,String name,String addr,String mail,String mob)
    {
        super(id,name,addr,mail,mob);
     }
     void computepay()
     {
        System.out.print("Entre Basic Pay:");
        Scanner input=new Scanner(System.in);
        BP=input.nextDouble();
        Gross_salary=BP;
        double DA,HRA,PF,Fund;
        DA=(BP*97/100);
        HRA=(BP*10/100);
        PF=(BP*12/100);
        Fund=(BP*0.1/100);
        Net_salary=BP+DA+HRA-(PF+Fund);
        System.out.println("Emp_ID:"+Emp_id);
        System.out.println("Emp_Name:"+Emp_name);
        System.out.println("Address:"+Address);
        System.out.println("Mail_ID:"+Mail_Id);
        System.out.println("Mobile Number:"+Mobile_no);
        System.out.println("Gross Pay:"+Gross_salary);
        System.out.println("Net Pay:"+Net_salary);
    }
}
