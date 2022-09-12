package seleniumJavaWeek1.day2;

public class Week1_day2_Assignment4_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1 we a";	
		int count = 0;
		int i=0;
		String[] split = text.split(" ");
		int length =split.length;
		for(i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				
				if(split[i].equalsIgnoreCase(split[j]))
					split[j]=" ";
				count++;
				//System.out.print(split[j]+ " ");
			}
		}
if(count>1)
{
	for(int k=0;k<length;k++)
	{
		System.out.print(split[k]+ " ");
	}

}
}
}