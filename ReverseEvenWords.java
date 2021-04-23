package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="I am a Software Tester";
		String[] data = name.split(" ");
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
		 if(i%2==0) {		
			 System.out.println(data[i]+" ");
		 }else {
			 for (int j = charArray.length-1; j >=0 ; j--) {
				 System.out.println(charArray[j]);
				
			}System.out.println(" ");
		
		 }
			}
			
		}
	}

