package week2.assignments;

public class ReverseEvenPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String splitText[] = test.split(" ");
		String odd = "";
		
		
		for(int i=0; i<splitText.length; i++){
			if(i%2 != 0){
				char charArray[] = splitText[i].toCharArray();
				for(int b=charArray.length; b>0; b--){
					odd = odd+charArray[b-1];					
				}
				System.out.println(odd);
			}
			else{
				System.out.println(splitText[i]);
			}
		}

	}

}
