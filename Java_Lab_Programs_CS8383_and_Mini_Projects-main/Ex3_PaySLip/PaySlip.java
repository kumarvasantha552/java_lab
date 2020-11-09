/*
* Ex:3 Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members.
* Inherit the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. 
* Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 
* 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. 
* Generate pay slips for the employees with their gross and net salary.
 */
package Ex3_PaySLip;

/**
 *
 */
public class PaySlip
{
    public static void main(String[] arg)
    {
     Programmer p=new Programmer(10,"AAA","xxx","aaa_xxx@gmail.com","1111111111");
      System.out.println("-------Programmer--------");
      p.computepay();

   Asst_Professor Ap=new Asst_Professor(20,"BBB","yyy","bbb_yyy@gmail.com","2222222222");
     System.out.println("-------Assistant Professor--------");
     Ap.computepay();

     Associate_Professor As=new Associate_Professor(30,"CCC","zzz","ccc_zzz@gmail.com","3333333333");
     System.out.println("-------Associate Professor--------");
     As.computepay();

     Professor pf=new Professor(40,"DDD","www","www_@gmail.com","4444444444");
     System.out.println("-------Professor-------");
     pf.computepay();
     }
}
