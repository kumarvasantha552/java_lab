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
public class TimeConverter
{
	public double HrToMin(double Hours)
	{
		double Minutes = 0;
		Minutes = Hours*60;
		return Minutes;
	}
	public double MinToHour(double Minutes )
	{
		double Hours= 0;
		Hours= Minutes /60;
		return Hours;
	}
	//
	public double HrToSec(double Hours)
	{
		double Seconds= 0;
		Seconds= Hours*3600;
		return Seconds;
	}
	public double SecToHour(double Seconds )
	{
		double Hours= 0;
		Hours= Seconds /3600;
		return Hours;
	}
}
	
	
	