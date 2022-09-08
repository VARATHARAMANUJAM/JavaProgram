package My_Basic_programs_OOPS;

public class Constructor_Parent {
	
	String team_name;
	int team_members=11;
	int All_rounder;
	int bowler;
	long bats_man;
	 Constructor_Parent(){
		System.out.println("Contructor is working ");
	}

	public Constructor_Parent(String string, int j, int k, int l) {
	team_name=string;
	//team_members=i;
	All_rounder=j;
	bowler=k;
	bats_man=l;
	}

	public static void main(String[] args) {
		Constructor_Parent obj = new Constructor_Parent("india",4,4,3);
		obj.Constructor_Parent_Team_Details();
		Constructor_Parent no_arg = new Constructor_Parent();
		no_arg.Constructor_Parent_Team_Details();
		
		
		}

	 void Constructor_Parent_Team_Details() {
		System.out.println("TOTAL MEMBERS : "+team_members);
		System.out.println("TEAM_NAME : "+team_name+" ALL_ROUNDER : "+All_rounder+" BOWLER : "+bowler+" BATS_MAN : "+bats_man);
			}

}
