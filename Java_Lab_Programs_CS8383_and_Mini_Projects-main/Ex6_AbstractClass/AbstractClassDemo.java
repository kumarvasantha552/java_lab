/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6_AbstractClass;

/**
 *
 */
import java.util.*;
class Rectangle extends Shape
{
	void printArea()
	{
		System.out.println("---Calculating area of rectangle---");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length:");
		a=in.nextDouble();

		System.out.println("\nEnter bredth:");
		b=in.nextDouble();

		double area = a*b;
		System.out.println("Area of rectangle:" +area);
	}
}

class Triangle extends Shape
{
	void printArea()
	{
		System.out.println("---Calculating area of triangle---");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter height:");
		a=in.nextDouble();

		System.out.println("\nEnter bredth:");
		b=in.nextDouble();

		double area = 0.5*a*b;
		System.out.println("Area of triangle:" +area);
	}
}

class Circle extends Shape
{
	void printArea()
	{
		System.out.println("---Calculating area of circle---");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius:");
		a=in.nextDouble();

		double area = 3.14*a*a;
		System.out.println("Area of circle:" +area);
	}
//       void disp()
//        {        System.out.println("Hi");
//        }
}


public class AbstractClassDemo
{
	public static void main (String args[])
	{
		Shape obj;
		obj = new Rectangle();
		obj.printArea();   System.out.println("Hashcode: " +obj.hashCode());	

		obj = new Triangle();
		obj.printArea();    System.out.println("Hashcode: " +obj.hashCode());
	
		obj = new Circle();
		obj.printArea(); 
                //obj.disp();
                System.out.println("Hashcode: " +obj.hashCode());
	}
}

