package day1;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		int sid;
		String sname;
		Scanner s=new Scanner(System.in);
		
		System.out.print("enter the sid and name:");
        sid=s.nextInt();
        sname=s.nextLine();
        
        System.out.print("sid:"+sid+"and sname:"+sname);
	}

}
