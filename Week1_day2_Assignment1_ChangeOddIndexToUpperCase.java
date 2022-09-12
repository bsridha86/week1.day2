package seleniumJavaWeek1.day2;

public class Week1_day2_Assignment1_ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s ="balabalu";
			char[] car = s.toCharArray();
			int a = car.length;
		//	System.out.println(a);
			for(int i=0;i<a;i++)
				{
					if(i%2==0)
					{
						System.out.print(Character.toUpperCase(car[i]));
					}
					else
					{
						System.out.print(car[i]);
					}
				}

	}

}
