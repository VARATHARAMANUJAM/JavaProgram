package My_Basic_programs_OOPS;

public class Super_Parent {
	
	String color ="white";
	
	 void eating() {
		System.out.println("eating");
	}
	public void run() {
		
		System.out.println("run");
	}
	protected void jog() {
		System.out.println("jog");
	}
	
	Super_Parent(){   // no arg constructor
		System.out.println("No arg constructor");
	}
	
	Super_Parent(int a , char c){  // Single arg constructor
		this();
		System.out.println("Single arg constructor");
	}
	public static void main(String [] arg) {
		Super_Parent obj=new Super_Parent(1,'g');   // Calling single arg constructor 
		
	}

}
