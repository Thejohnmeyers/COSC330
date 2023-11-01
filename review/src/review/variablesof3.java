package review;

public class variablesof3 {
	public static void main(String[] args)
	{
		int[] grades = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<grades.length; i++){
		System.out.println(grades[(2*grades[i]) % 10]);
		}

		
	}
}
