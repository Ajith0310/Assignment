package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String rev ="";
		char[] data = name.toCharArray();
		for (int i = data.length-1; i >=0 ; i--) {
			rev=rev+data[i];
			if(name.equalsIgnoreCase(rev)) {
				System.out.println("The String is Palindrome-"+name);
			}else {
				System.out.println("The String is not Palindrome-"+name);
			}
			
		}
	}

}
