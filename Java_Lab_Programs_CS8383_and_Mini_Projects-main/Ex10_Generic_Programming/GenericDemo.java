/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10_Generic_Programming;

/**
 *
 */
// We use < > to specify Parameter type 
//class Test<T> 
//{ 
//    // An object of type T is declared 
//    T obj; 
//    Test(T obj) // constructor  
//    {  
//        this.obj = obj;  
//    }  
//    public T getObject()  
//    { 
//        return this.obj; 
//    } 
//} 
//   
//// Driver class to test above 
//class Main 
//{ 
//    public static void main (String[] args) 
//    { 
//        // instance of Integer type 
//        Test <Integer> iObj = new Test<Integer>(15); 
//        System.out.println(iObj.getObject()); 
//   
//        // instance of String type 
//        Test <String> sObj = new Test<String>("Hi"); 
//        System.out.println(sObj.getObject()); 
//    } 
//}



import java.util.*;
class genericDemo
{
	public static <T extends Object & Comparable<? super T >> 	
T max(Collection<? extends T> coll)
	{
		Iterator<? extends T> list = coll.iterator();
		T element = list.next();

		while(list.hasNext())
		{
			T next_element = list.next();
			if(next_element.compareTo(element)>0)
			element = next_element;
		}
		return element;
	}
	public static void main(String[] args)
	{
		List <Integer> ints = new ArrayList<Integer> (Arrays.asList(66, 55,11,5,99));
		int max= Collections.max(ints);
		System.out.println("Given value: " +ints);
		System.out.println("Maximum value is: " +max);

		//Perform the same to find max. Character (Example: 'z','a','b')
	List <Character> ints2 = new ArrayList<Character> (Arrays.asList('z','a','b'));
	char max2= Collections.max(ints2);
	System.out.println("Given value: " +ints2);
	System.out.println("Maximum value is: " +max2);
	}
}

