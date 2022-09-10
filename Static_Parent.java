package My_Basic_programs_OOPS;

public class Static_Parent {
	
	static int a;
	static void add () {
		System.out.println("---->Static method ");
	}
	static void add (int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	static {
		System.out.println("Static block ");
		a=10;
		System.out.println(a+" ---> static block");
	}

	public static void main(String[] args) {
		Static_Parent obj = new Static_Parent();
		add();
		System.out.println(a);
		obj.a=10;
		System.out.println(a+1);
		System.out.println(obj.a+"--->calling by obj");
		obj.add();
		
			}

}
