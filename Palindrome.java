package week2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "madam";
		String s2 = "";
		
		for (int i=s1.length()-1; i>=0;i--){
			s2 = s2+s1.charAt(i);
					
		}
		
		if(s1.equals(s2)){
			System.out.println("The String "+s1+" is a Palindrome.");
		}
		else{
			System.out.println("The String "+s1+" is not a Palindrome.");
		}
		
	}

}
