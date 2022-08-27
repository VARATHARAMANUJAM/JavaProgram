package My_Basic_programs_OOPS;

public class Acess_Modify_Child_  {

	public static void main(String[] args) {
		Acess_Modifier_Parent obj_parent = new Acess_Modifier_Parent();
		obj_parent.protected_Method();
		obj_parent.protected_Method();
		obj_parent.public_Method();
		obj_parent.default_Method();
		Acess_Modify_Child_ obj = new Acess_Modify_Child_ ();
		
	}

}
