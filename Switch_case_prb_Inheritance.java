package My_Basic_programs;

import java.util.Scanner;

import My_Basic_programs_OOPS.Acess_Modifier_Parent;
import My_Basic_programs_OOPS.Child_Abstract;

 class Switch_case_prb extends Acess_Modifier_Parent   {

	public static void main(String[] args) {
		
		//another package class
		//Acess_Modifier_Parent obj_parent = new Acess_Modifier_Parent();
		Switch_case_prb obj_parent = new Switch_case_prb();
		obj_parent.public_Method();
		obj_parent.protected_Method();// protected achieved in child obj
       
//		Child_Abstract obj2= new Child_Abstract();
//		obj2.LCM_Method_1();
//		Switch_case_prb obj = new Switch_case_prb();
		while (true) {
		Scanner sc = new Scanner(System.in);
			//System.out.println(obj.Switch_Case(sc.nextInt()));
		}
		}
	
	
	public String Switch_Case(int n) {
		String s =  "--It is even number";
		String l = "--It is odd number";
		int t = 0 ;
		{
		if(n%2==0) {
			t=0;
			//System.out.println(n+"--It is even number");
		}else if (n%2!=0) {
			t=1;
			//System.out.println(n+"--It is odd number");
		}}
		
		switch(t) {
		
		case (0):{
			return s ;
		}
		case (1):{
			return l;
		}
		default :{
			return "invalid";
		}
		
		}
	}

	

}
