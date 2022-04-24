package week2.day1.classroom;

public class StringMethods {

	public static void main(String[] args) {

		StringMethods obj = new StringMethods();
		obj.printLetter_e();
		System.out.println("--------------");
		obj.printWordsStartsWith_T();
	}

	public void printLetter_e() {

		String text0 = "testleaf";
		char[] charArray1 = text0.toCharArray();
		for (char i : charArray1) {
			if (i == 'e') {
				System.out.println(i);
			}
		}

	}
	
	public void printWordsStartsWith_T()
	{
	String text1 = "Testleaf is situated in twin towers teynampet";
	String[] words = text1.split(" ");
	for(String wordTort : words) {
		if(wordTort.startsWith("T") || wordTort.startsWith("t"))
		{
			System.out.println(wordTort);
		}
		/*
		 * else if (wordTort.startsWith("t")) { System.out.println(wordTort); }
		 */
	}
	
	}

}
