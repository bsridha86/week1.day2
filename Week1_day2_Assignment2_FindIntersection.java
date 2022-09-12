package seleniumJavaWeek1.day2;

public class Week1_day2_Assignment2_FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] farray = {3,2,11,4,6,7};
		int[] sarray =  {1,2,8,4,9,7};
		
		for(int i=0;i<farray.length;i++)
		{
			for(int j=0;j<sarray.length;j++)
			{
				if(farray[i]==sarray[j])
					System.out.println(farray[i]);
			}
		}
		
	}

}
