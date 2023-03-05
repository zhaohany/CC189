package Q1_03_URLify;

public class QuestionZ {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int count = countSpace(str,trueLength);
		int final_index = count * 2 + trueLength -1;
		if (final_index+1 < str.length){
			str[final_index+1] = '\0';
		}

		for(int j = trueLength-1; j>=0; j--){
			if(str[j] == ' '){
				str[final_index] = '0';
				str[final_index-1] = '2';
				str[final_index-2] = '%';
				final_index-=3;
			}else {
				str[final_index] = str[j];
				final_index-=1;
			}
		}
		return;



	}

	public static int countSpace(char[] str, int trueLength){
		int count = 0;
		for (int i = 0; i< trueLength-1; i++){
			if(str[i] == ' ') {
				count++;
			}
		}
		return count;

	}

	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		replaceSpaces(arr, trueLength);
		String string = new String(arr);
		System.out.println("\"" + string + "\"");
	}
}
