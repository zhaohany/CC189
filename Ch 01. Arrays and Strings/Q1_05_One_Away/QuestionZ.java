package Q1_05_One_Away;

public class QuestionZ {
	
	public static boolean oneEditAway(String first, String second) {
		if(Math.abs(first.length()-second.length()) > 1){
			return false;
		}else{
			boolean foundDiff = false;
			String shortS = first.length()>second.length()? second: first;
			String longS = first.length()>second.length()? first: second;
			int pointerA = 0, pointerB = 0;
			while(pointerA < longS.length() && pointerB < shortS.length()){
				if(longS.charAt(pointerA) != shortS.charAt(pointerB)){
					if(foundDiff){
						return false;
					}else{
						foundDiff = true;
						if (shortS.length() == longS.length() ){
							pointerB++;
						}
					}
				}else{
					pointerB++;
				}
				pointerA++;
			}

		}
		return true;

	}
	
	public static void main(String[] args) {
		String a = "pse";
		String b = "pale";
		boolean isOneEdit = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit);
	}

}
