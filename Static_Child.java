package My_Basic_programs_OOPS;

public class Static_Child  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Static_Parent obj = new  Static_Parent();
		obj.add();
		Static_Parent.add();
		 Static_Parent.a=1000;
        System.out.println(obj.a);
	}

}
