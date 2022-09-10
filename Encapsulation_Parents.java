package My_Basic_programs_OOPS;

public class Encapsulation_Parents {

	
	private int roll_number=10;
	private String name =" Ram";
	
	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
		System.out.println(roll_number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {
	}
	

}
