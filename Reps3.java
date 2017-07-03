public class Reps3{
	public static void main(String[] args) {
		int[] arr={1,3,5};
		int[] brr={1,2,3,4,5};
		int count=0;
		if(arr.length<brr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<brr.length;j++)
				{
					if(arr[i]==brr[j])
					{
						count++;
					}
				}
			}
			if(count==arr.length)
			{
				System.out.println("a is the subset of b");
			}
			else
			{
				System.out.println("a is not the subset of b");
			}
		}
		else
		{
			System.out.println("Reverse size of the string");
		}	
	}
}