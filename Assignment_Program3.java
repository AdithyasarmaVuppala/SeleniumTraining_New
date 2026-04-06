package Assignments;

import java.util.Scanner;

public class Assignment_Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57243;
		String s = "";
		int pos = 1;
		while(n>0)
		{
			int r = n%10;
			if(r<=4 && pos%2!=0)
			{
				r = r*2;
				s = s + r;
				pos++;
			}
			else if(pos%2==0)
			{
				r = 1;
				s = s + r;
				pos++;
			}
			else {
				s = s + r;
				pos++;
			
			}
			n = n/10;
		}
		int result = Integer.parseInt(s);
		System.out.println(result);

	}

}
