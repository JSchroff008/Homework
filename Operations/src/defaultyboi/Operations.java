package defaultyboi;
public class Operations{
	
	public static void main(String[] args) {
		//operator performs actions on operands
		// + - * /
		int age = 34;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		System.out.println(age == 34);
		
		age = age + 1;
		System.out.println(age);
		
		String firstName = "Jacob";
		String lastName = "Schroff";
		String fullName = firstName + " " + lastName; //Concatenation (adding stings/words together)
		System.out.println(fullName);
	}
}