package Q1_04_Palindrome_Permutation;

public class QuestionZ {
	public static boolean isPermutationOfPalindrome(String phrase) {
		int [] count_map = new int[26];
		char[] phrase_array = phrase.toCharArray();
		int odd_count = 0;
		for (int i = 0; i<phrase_array.length; i++){
			int charnum = getCharNum(phrase_array[i]);
			//System.out.print(phrase_array[i]);
			//System.out.println(charnum);
			if(charnum != -1){
				count_map[charnum]++;
				if(count_map[charnum]%2 == 0){
					odd_count--;
				}else{
					odd_count++;
				}
			}
		}
		if(odd_count > 1){
			return false;
		}else{
			return true;
		}

	}

	public static int getCharNum(char letter){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int l = Character.getNumericValue(letter);
		if(a<=l && z>=l) {
			return  l - a;
		}else{
			return -1;
		}

	}
	
	public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}
}
