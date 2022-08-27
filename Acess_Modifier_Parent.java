package My_Basic_programs_OOPS;

public class Acess_Modifier_Parent {
	
	public void public_Method() {
		System.out.println("Access any where");
	}
	protected void protected_Method() {
		System.out.println("only access within the package with relationship ");
	}
	 void default_Method() {
		System.out.println("Access inside the package ");
	}
	 private  void private_Method() {
			System.out.println("only access inside the class");
		} 

}
