package Q1_06_String_Compression;

public class QuestionZ {
	public static String compressBad(String str) {
		if(str.length()<=0){
			return str;
		}
		StringBuilder newstr = new StringBuilder();
		int charCount = 0;
		for (int i = 0; i< str.length(); i++){
			charCount++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				newstr.append(str.charAt(i));
				newstr.append(charCount);
				charCount = 0;
			}
		}
		return newstr.length() < str.length() ? newstr.toString(): str;


	}
	
	public static void main(String[] args) {
		String str = "aa";
		System.out.println(str);
		System.out.println(compressBad(str));
	}
}
