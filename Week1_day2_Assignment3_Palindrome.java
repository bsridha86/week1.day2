package seleniumJavaWeek1.day2;

public class Week1_day2_Assignment3_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "Malayalam";
		String reverse = "";
		int length = original.length();
	
//		char[] oricar = original.toCharArray();
//		char [] revcar = reverse.toCharArray();
		
		for(int i=length;i>0;i--)
		{
			reverse=reverse+original.charAt(i-1);
				
		}
		System.out.println(original);
		System.out.println(reverse);
		if(original.equalsIgnoreCase(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
	}

}
