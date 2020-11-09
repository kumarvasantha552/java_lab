/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9_Multithreaded_Application;

/**
 *
 */
//import java.util.*;
import java.util.Random;
class NumberGenerate
{
	private int value;
	private boolean flag;
//producer
	public synchronized void put()
	{
		while(flag)
		{
		try{
			wait();
		     }	catch(InterruptedException e){System.out.println(e); }
		   
		}
		flag =true;
		Random random = new Random();//
		this.value=random.nextInt(10);
		System.out.println("The generated Number is:" +value);
		notifyAll();
	}
//consumer
	public synchronized void get1()
	{
		while(!flag)
		{
		try{
			wait();
		      }	catch(InterruptedException e) {System.out.println(e); }
		   
		}
		if(value%2==0)
		{
			System.out.println("2nd thread is executing now..");
			int ans=value*value;
			System.out.println(value + "is Even Number and its SQUARE is:" +ans);
		}
		flag =false;
		notifyAll();
	}

	public synchronized void get2()
	{
		while(!flag)
		{
		try{
			wait();
		     }	catch(InterruptedException e) {System.out.println(e); }
		   
		}
		if(value%2!=0)
		{
			System.out.println("3rd thread is executing now..");
			int ans=value*value*value;
			System.out.println(value + "is Odd Number and its CUBE is:" +ans);
		}
		flag =false;
		notifyAll();
	}
}

public class multiThreadedAppln
{
	public static void main(String[] args)
	{
		final NumberGenerate obj = new NumberGenerate();
		Thread producerThread = new Thread()
		{
		public void run()
		   {
			for(int i=1; i<=6; i++)
			{
			System.out.println("Main thread started..");
			obj.put();
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e) {System.out.println(e); }
			}
		   }
		};
	
		Thread consumerThread1=new Thread()
		{
		public void run()
		   {
			for(int i=1; i<=3; i++)	
			{
			obj.get1();
			try
			{
				Thread.sleep(2500);
			}catch(InterruptedException e) { System.out.println(e);}
			}
		    }
		};

		Thread consumerThread2=new Thread()
		{
		public void run()
		   {
			for(int i=1; i<=3; i++)	
			{
			obj.get2();
			try
			{
				Thread.sleep(5000);
			}catch(InterruptedException e) {System.out.println(e); }
			}
		    }
		};
		producerThread.start();
		consumerThread1.start();
		consumerThread2.start();
	}
}	


