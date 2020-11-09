/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7_UserDefinedException;

/**
 *
 */
//public class ThrowUserDefined
//{  
//  	 void checkAge(int age)
//	{ 
//		if(age<18)  
//	      	throw new ArithmeticException("Not Eligible for voting");  
//		else  
//	   	System.out.println("Eligible for voting");  
//   	}  
//   	public static void main(String args[])
//	{  
//		ThrowUserDefined obj = new ThrowUserDefined ();
//		obj.checkAge(19);  
//		System.out.println("End Of Program");  
//   	}  
//}


class MyException extends Exception{
   int a;
   MyException(int b) {
     a=b;
   }
   public String toString(){
     return ("Exception Number =  "+a) ;
  }
}
class JavaException{
   public static void main(String args[]){
  try{
       throw new MyException(2);
       // throw is used to create a new exception and throw it.
  }
 catch(MyException e){
    System.out.println(e) ;
 }
}
}