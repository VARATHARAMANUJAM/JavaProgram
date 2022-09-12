package My_Basic_programs_OOPS;

public class Super_Implemented_Child_And_This_Keyword extends Super_Parent {
	
	public static void main(String[] args) {
		Super_Implemented_Child_And_This_Keyword obj = new Super_Implemented_Child_And_This_Keyword();
       // obj.run();
        //obj.color();
		//obj.eating();
        //System.out.println(obj.color);
        
	}
	Super_Implemented_Child_And_This_Keyword(){
		super(1,'s');
		
		System.out.println("child constructor");
	}
	
	String color ="black";
	int eat = 5;
	void eating() {
		super.eating();
		int eat =4;
		int total = eat +this.eat;
		System.out.println("eating" + total);
	}
	public void run() {
		eating();
		super.jog();
		super.run();
		super.eating();
		System.out.println("run");
	}
	protected void jog() {
		run();
		super.jog();
		System.out.println("jog");
	}
	
	final void color() {
	String color = this.color + super.color;
		 System.out.println(color);
		 
	}
	
}
