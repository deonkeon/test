package chap99_homework;

public class CheckStr2 {

	public static void main(String[] args) {
		char[] arr = { 'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't' };

		for (int i = 0; i <= arr.length - 9; i++) {
			char word1 = arr[i];
			char word2 = arr[i + 4];
			char word3 = arr[i + 8];

			String word = "" + word1 + word2 + word3;

			if (word.equals("bit") || word.equals("com") || word.equals("sql") || word.equals("int")) {
				System.out.println(word);
			}
		}
	}
}