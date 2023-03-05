package Q1_02_Check_Permutation;

public class QuestionC {
	public static boolean permutation(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}
		int[] checker = new int[128];//ascii
		for (int i = 0; i< s.length(); i++){
			checker[s.charAt(i)]++;
		}
		for (int j = 0; j<t.length(); j++){
			checker[t.charAt(j)]--;
			if(checker[t.charAt(j)] < 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
