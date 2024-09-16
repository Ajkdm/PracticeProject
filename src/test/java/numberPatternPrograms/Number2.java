package numberPatternPrograms;


public class Number2 {

	public static void main(String[] args)
	{
		int number=1;
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 5; j>=i; j--) 
			{
				System.out.print(number++ +" ");
				//number++;
			}
			System.out.println();
		}

	}

}
