package day28_reviewWithMiran;

public class PersonObj {

	public static void main(String[] args) {
		
		Person Syed = new Person("Syed", 26, "SDET", "Ithaca", false);
		
		Syed.introduce();
		
		Syed.birthday(27);
        Syed.changeOccupation("Software Developer");		
        Syed.move("Atlantic City");
        Syed.maritialStatus(true);
        
		System.out.println("--------------------------");
		
		Syed.introduce();
	}

}
