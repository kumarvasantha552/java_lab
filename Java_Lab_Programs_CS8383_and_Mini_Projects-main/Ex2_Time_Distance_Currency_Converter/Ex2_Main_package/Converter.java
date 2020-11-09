/*
* Exercise: 02 Develop a java application to implement currency converter (Dollar to INR, Euro to INR, 
* Yen to INR and vice versa), Distance converter (meter to KM, miles to KM and vice versa), 
* time converter (Hours to minutes, seconds and vice versa) using packages.
 */
package Ex2_Main_package;

/**
 *
 * 
 */

import Ex2_Converter.CurrencyConverter;
import Ex2_Converter.DistanceConverter;
import Ex2_Converter.TimeConverter;
import java.util.Scanner;
class Converter
{
public static void main(String args[])
{	
	double CurrentExchange;
	int choice, choice1, choice2, choice3;
	double inr, km, hr;
	char ans='y';
do
{
	System.out.println("\n Main menu");
	System.out.println(" 1.Currency Converter \n 2.Distance Converter \n 3.Time converter");
	System.out.println("Enter ur choice");
	
	Scanner input = new Scanner(System.in);
	choice = input.nextInt();

	switch(choice) //Outer switch
	{
case 1:
	do
	{
	System.out.println("Menu for currency conversion");
	System.out.println("1. Dollar to INR");
	System.out.println("2. INR to Dollar");
	System.out.println("3. Euro to INR");
	System.out.println("4. INR to Euro");
	System.out.println("5. Yen to INR");
	System.out.println("6. INR to Yen");

	System.out.println("Enter your choice");
	choice1 = input.nextInt();
	System.out.println("Please enter the current exchange rate:");
	CurrentExchange = input.nextDouble();
	CurrencyConverter cc = new CurrencyConverter(CurrentExchange);
	switch(choice1) //inner switch
	{
	case 1:
		System.out.print("Enter Dollars:");
		double dollar = input.nextDouble();
		System.out.println(dollar+" dollars are converted to "+cc.DollarToINR(dollar)+"Rs.");
	break;
	case 2:
		System.out.print("Enter INR:");
		inr= input.nextDouble();
		System.out.println(inr+" Rs. are converted to "+cc.INRToDollar(inr)+"Dollars");
	break;
	case 3:
		System.out.print("Enter Euro:");
		double euro = input.nextDouble();
		System.out.println(euro+" Eurosare converted to "+cc.EuroToINR(euro)+"Rs.");
	break;
	case 4:
		System.out.print("Enter INR:");
		inr= input.nextDouble();
		System.out.println(inr+" Rs. are converted to "+cc.INRToDollar(inr)+"Dollars");
	break;
	case 5:
		System.out.print("Enter Yen:");
		double yen= input.nextDouble();
		System.out.println(yen+" yens are converted to "+cc.YenToINR(yen)+"Rs.");
	break;
	case 6:
		System.out.print("Enter INR:");
		inr= input.nextDouble();
		System.out.println(inr+" Rs. are converted to "+cc.INRToDollar(inr)+"Dollars");
	break;
	}
	System.out.println("Do you want to go to Currency conversion menu? (y/n)");
	ans = input.next().charAt(0);
	}while(ans=='y');
	break;

case 2:System.out.println("--distance conversion--");
do
{

	System.out.println("Menu for distance conversion");
	System.out.println("1. Meter to KM");
	System.out.println("2. KM to Meter");
	System.out.println("3. Miles to KM");
	System.out.println("4. KM to Miles");
	
	System.out.println("Enter your choice");
	choice2 = input.nextInt();
	
	DistanceConverter dc = new DistanceConverter();
	switch(choice2) //inner switch
	{
	case 1:
		System.out.print("Enter meters to convert to km:");
		double meter = input.nextDouble();
		System.out.println(meter+" meters are converted to "+dc.MeterToKM(meter)+"Km.");
	break;
	case 2:
		System.out.print("Enter Km to convert to meters:");
		km= input.nextDouble();
		System.out.println(km+" Km. are converted to"+dc.KMToMeter(km)+"Meters");
	break;
	case 3:
		System.out.print("Enter Miles to convert to Km:");
		double miles= input.nextDouble();
		System.out.println(miles+" Miles are converted to "+dc.MileToKM(miles)+"Km.");
	break;
	case 4:
		System.out.print("Enter Km to convert to miles:");
		km= input.nextDouble();
		System.out.println(km+" Km. are converted to miles "+dc.KMToMile(km)+"Miles");
	break;

	}
	System.out.println("Do you want to go to Distance conversion menu? (y/n)");
	ans = input.next().charAt(0);
	}while(ans=='y');
	break;
case 3: System.out.println("--time conversion--");
do
{

	System.out.println("Menu for time conversion");
	System.out.println("1. Hour to Minutes");
	System.out.println("2. Minutes to Hour");
	System.out.println("3. Hour to Seconds");
	System.out.println("4. Seconds to Hour");
	
	System.out.println("Enter your choice");
	choice3 = input.nextInt();
	
	TimeConverter tc = new TimeConverter();
	switch(choice3) //inner switch
	{
	case 1:
		System.out.print("Enter Hours to convert to Minutes:");
		hr= input.nextDouble();
		System.out.println(hr+" Hours are converted to "+tc.HrToMin(hr)+"min.");
	break;
	case 2:
		System.out.print("Enter minutes to convert to hours:");
		double minutes= input.nextDouble();
		System.out.println(minutes+"Minutes are converted to"+tc.MinToHour(minutes)+"Hours");
	break;
	case 3:
		System.out.print("Enter hours to convert to seconds:");
		hr= input.nextDouble();
		System.out.println(hr+" Hours are converted to "+tc.HrToSec(hr)+"Seconds.");
	break;
	case 4:
		System.out.print("Enter seconds to convert to hours:");
		double seconds= input.nextDouble();
		System.out.println(seconds+" seconds are converted to  "+tc.SecToHour(seconds)+"Hours");
	break;

	}
	System.out.println("Do you want to go to time conversion menu? (y/n)");
	ans = input.next().charAt(0);
	}while(ans=='y');
	break;
}//end of outer switch

System.out.println("Do you want to go back to main menu? (y/n)");
ans = input.next().charAt(0);
}while(ans=='y');
}//end of main
}
