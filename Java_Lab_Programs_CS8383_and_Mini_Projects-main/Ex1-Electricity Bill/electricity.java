


/**
 *
 * 
 */
import java.util.Scanner;
public class electricity
{
    public static void main(String args[])
    {
	double units, amount =0;
	String cno, cname, conn;
	double prevr, currr;
	Scanner input = new Scanner (System.in);

	System.out.println("Enter customer no:");
	cno= input.next();

	System.out.println("Enter customer name:");
	cname = input.next();

	System.out.println("Enter prev month reading:");
	prevr= input.nextDouble();

	System.out.println("Enter current month reading:");
	currr=input.nextDouble();

	System.out.println("Enter type of connection(D/C):");
	conn = input.next();

	units = currr - prevr;

	if(conn.equals("D"))
	{
		if(units<=0)
			amount=0;
		else if(units<=100)	
			amount = units*2;
		else if(units<=200)
			amount = units*2.5;
		else if (units<=500)
			amount = units*4;
		else
			amount = units*6;
	} 
	else if(conn.equals("C"))
	{
		if(units<=0)
			amount=0;
		else if(units<=100)	
			amount = units*3;
		else if(units<=200)
			amount = units*4.5;
		else if (units<=500)
			amount = units*6;
		else
			amount = units*7;
	} 
	System.out.println("Bill amount:" +amount);	
   }

}
















//Viva Questions
//1.	What do you mean by Platform Independence? 
//2.	What is JIT Compiler? 
//3.	What all memory areas are allocated by JVM? 
//4.    What are java buzzwords? List popular java ID Es? 
//5.    What is a class and Object?
//6.	What is instance?
//7.	Why do we need the import statement in Java?
//8.	What is the use of Scanner class?
//9.	What is a loop statement?
//10.	What is validation?

