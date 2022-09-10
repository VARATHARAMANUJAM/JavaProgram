package My_Basic_programs_OOPS;

public class Encapsulation_Child {

	public static void main(String[] args) {
		Encapsulation_Parents obj = new Encapsulation_Parents();
	System.out.println(	obj.getName());
	System.out.println(obj.getRoll_number());
	obj.setRoll_number(12222);
	obj.setName("suriya");
	System.out.println(	" ---"+obj.getName());
	System.out.println(	" ---"+obj.getRoll_number());
	}

}
