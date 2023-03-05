package Q1_01_Is_Unique;

public class QuestionC {
	public static boolean isUniqueChars(String str) {
		boolean[] checker = new boolean[128]; //assume it is ascii with 128 unique characters
		for (int i = 0; i< str.length() ; i++){
			int checker_index = str.charAt(i);
			if(checker[checker_index]){
				//found
				return false;
			}else {
				checker[checker_index] = true;
			}
		}
		return true;

	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
