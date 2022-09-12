package seleniumJavaWeek1.day2;

public class Week1_day2_Assignment5_ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] split = test.split(" ");
		int length = split.length;
		
		for(int i=0;i<length;i++)
		{
			if(i%2!=0)
			{
				String tempString = split[i];
				String tempRevString = " ";
				int templength = split[i].length();
				for(int j=templength;j>0;j--)
				{
					tempRevString=tempRevString+tempString.charAt(j-1);
				}
				split[i]=tempRevString;
			}
			System.out.print(split[i]+ " ");
		}
	}

}
