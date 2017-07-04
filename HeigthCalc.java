import java.util.Arrays;


import java.util.Scanner;
public class HeightCalc
{

	public static void main(String[] args)
	{
		

		Scanner in=new Scanner(System.in);
		int[] arr=new int[50]
;
		System.out.println("Enter the 50 height values:");
		for(int i=0;i<arr.length;i++){
		arr[i]=in.nextInt();
		}
		Arrays.sort(arr);

		int arr1[]=new int[arr.length];

		int count=0;

			for(int i=arr.length-1;i<arr.length;i--){

			    arr1[count]=arr[i];
    
			    count++;
		

				if(i<=0){

					break;
				
				}

			}
		System.out.println("The 4th height is->"+arr1[4]);
		System.out.println("Enter the k value");

		System.out.println(arr1[k]);		
	}

}