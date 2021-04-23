package week1.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input ="We learn java bascis as part of java session in java week1";
			String[] data =input.split(" ");
			for (int i = 0; i < data.length; i++) {
				for (int j = +1; j < data.length; j++) {
					if(data[i].equals(data[j])){
						System.out.println(data[i]+" ");
						
					
					}
					
					
				}
				
			}
			
	}

}
