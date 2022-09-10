package My_Basic_programs_OOPS;

import java.util.Scanner;

abstract public class Parent_Abstracts {
	
	 public int a=10;
	 abstract void LCM_Method_1();
	abstract void LCM_Method_2(int a,int b);
	abstract void GCM_Method();
	
	 static protected void Series_6() {
		//Find the next term in the series :1 9 17 33 49 73 97 129 161,_(8,8,16,16,24,24,32,32	
		int first=1;
		int second = 9;
		int sum=0;
		int count=1;
		for (int i=1;i<=10;i++) {
			System.out.print(first+" ");
			sum=second-first;
			first =  second ;
			if(count<2) {
			second = sum + first;
			count++;
			}else {
				count=1;
				second=(sum+8)+first;
			}				
		}
	}
}
