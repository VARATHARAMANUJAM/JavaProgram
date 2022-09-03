package My_Basic_programs_OOPS;

public class Polymorphism_Son extends Polymorphism_Father   {
		public static void main(String[] args) {
			String s="hello";
		Polymorphism_Father obj1 = new Polymorphism_Father ();
		obj1.Ambition();
		
		 Polymorphism_Son obj = new  Polymorphism_Son();
		obj.Ambition(); 
		obj.String();
		obj.Ambition();
		
		

	}
		private void String() {
			
		}
		public  int  Ambition() {
			System.out.println("Developer");
			return 0;
		}
//		public  void log_in_2(String Gmail) {
//			System.out.println("WELCOME u login with gmail");
//		}
//		public  void log_in_3(char Goggle) {
//			System.out.println("WELCOME u login with goggle");
//		} 	
}


