package day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args)throws IOException
	{
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		try 
		{
		int c=a/b;//may be exception occurs in runtime- throw the exception to catch block/implicity
		System.out.println("Division:" +c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception occurs:"+ae);
			System.out.println("please enter positive numbers....");
		}
		System.out.println("nextline");
		}

	}


