package My_Basic_programs_OOPS;

 class Interface_Child extends Interface_Parent_Mother implements Interface_Parent_Father {
	 
	public static void main(String[] args) {
		Interface_Child obj = new Interface_Child();
		obj.Interface_Parent_Method_1();
		obj.Interface_Parent_Method_2();
		obj.Eathing();
		obj.cooking();
		//System.out.println(obj.a );
		// System.out.println(  obj.b);
	}

int b =256;
  public void Interface_Parent_Method_1() {
	  for (int i=0;i<5;i++) {
		  for (int j=0;j<5;j++) {
			  if(i==0 || j==0 || i==4 || j==4 || i==2 || j==2) {
				  System.out.print("* ");
			  }else
				  System.out.print("  ");
		  }System.out.println();
	  }System.out.println();
  }

  
@Override
public void Interface_Parent_Method_2() {
	  for (int i=0;i<5;i++) {
		  for (int j=0;j<5;j++) {
			  if(i==0 || j==0 || i==4 || j==4 || i==2 || j==2) {
				  System.out.print("* ");
			  }else
				  System.out.print("   ");
		  }System.out.println();
	  }System.out.println();
}

@Override

void Eathing() {
	
System.out.println("Hi all,This is compiler ");
System.out.println();
}

}
