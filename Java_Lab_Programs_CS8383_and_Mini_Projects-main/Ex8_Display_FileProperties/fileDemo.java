/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex8_Display_FileProperties;

/**
 *
 */
import java.util.Scanner;
import java.io.File;
class fileDemo
{
public static void main(String[] args)
{
System.out.println("Enter the file name:");
Scanner input = new Scanner(System.in);
String s = input.nextLine();

File f1=new File(s);

System.out.println("-------------------------");
System.out.println("File Name:	" +f1.getName());
System.out.println("Path:	" +f1.getPath());
System.out.println("Abs Path:	" +f1.getAbsolutePath());
System.out.println("This file:	" +(f1.exists()?"Exists":"Does not exists"));
System.out.println("File:	" +f1.isFile());
System.out.println("Directory:	" +f1.isDirectory());
System.out.println("Readable:	" +f1.canRead());
System.out.println("Writable:	" +f1.canWrite());
System.out.println("Absolute:	" +f1.isAbsolute()); 
System.out.println("File Size:	" +f1.length()+ "bytes");
System.out.println("Is Hidden:	" +f1.isHidden());
}
}

