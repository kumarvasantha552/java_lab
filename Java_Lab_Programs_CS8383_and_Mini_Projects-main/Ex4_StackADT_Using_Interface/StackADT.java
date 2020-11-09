/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4_StackADT_Using_Interface;

/**
 *
 */
import java.io.*;
class Stack_array implements interface1
{
    int n=3;
    int stack[]=new int[n];
    int top=-1;
    public void push()
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            if(top==(n-1))
            {
                System.out.println(" Stack Overflow");
                return;
            }
            else
            {
                System.out.println("Enter the element");
                int ele=Integer.parseInt(br.readLine());
                stack[++top]=ele;
            }
        }
        catch(IOException e)
        {
            System.out.println("e");
        }
    }
    @Override
    public void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return;
        }
        else
        {
            int popper=stack[top];
            top--;
            System.out.println("Popped element:" +popper);
        }
    }
     public void display()
    {
        if(top<0)
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        { String str=" ";
            for(int i=0; i<=top; i++)
                str=str+"  "+stack[i]+" <--";
            System.out.println("Elements are:"+str);
        }
    }
}
class StackADT
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Implementation of Stack using Array");
        Stack_array stk=new Stack_array();
        int ch=0;
        do
        {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            System.out.println("Enter your choice:");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
            case 1:
                stk.push(); break;
            case 2:
                stk.pop(); break;
            case 3:
                stk.display(); break;
            case 4:
                System.exit(0);
            }
        }while(true);
    }
}

