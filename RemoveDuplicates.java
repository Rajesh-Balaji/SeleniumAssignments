package week2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		String splitText[] = text.split(" ");
		int count = 0;
		String finalText = "";
		
		for(int a = 0; a<splitText.length; a++){
			while(splitText[a].equalsIgnoreCase("java")){
				count++;
				
				if(count>0){
					finalText = text.replace(splitText[a], "");
					break;
				}
			}			
			
		}
		
		System.out.println(finalText);
		

	}

}
