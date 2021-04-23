package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "changeme";
		char[] name = data.toCharArray();
		for (int i = 0; i < name.length; i++) {
			if(i%2 == 0) {
				System.out.println(name[i]);
			}
			else {
				System.out.println("The upper case is-"+Character.toUpperCase(name[i]));
			}
		}
		
	}

}
