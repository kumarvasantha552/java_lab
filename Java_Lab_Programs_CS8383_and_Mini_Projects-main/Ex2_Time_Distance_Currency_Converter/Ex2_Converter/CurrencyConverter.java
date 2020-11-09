/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2_Converter;

/**
 *
 *
 */
public class CurrencyConverter
{
	double ER = 0;
	public CurrencyConverter(double CurrentExchange)
	{
		ER = CurrentExchange;
	}
	
	public double DollarToINR(double Dollars)
	{
		double INR=0;
		INR = Dollars * ER;
		return INR;
	}

	public double INRToDollar(double INR)
	{
		double Dollars =0;
		Dollars = INR/ ER;
		return Dollars;
	}
	//
	public double EuroToINR(double Euros)
	{
		double INR=0;
		INR = Euros* ER;
		return INR;
	}

	public double INRToEuro(double INR)
	{
		double Euros=0;
		Euros= INR/ ER;
		return Euros;
	}
	//
	public double YenToINR(double Yens)
	{
		double INR=0;
		INR = Yens* ER;
		return INR;
	}

	public double INRToYen(double INR)
	{
		double Yens=0;
		Yens= INR/ ER;
		return Yens;
	}
}

