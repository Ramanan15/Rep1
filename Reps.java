import java.util.*;
public class Reps{
   public static void main(String[] args){
      Scanner in= new Scanner(System.in); 
       int no=in.nextInt();
       int arr[]=new int[no];
       	   for(int i=0;i<no;i++)
           {
           arr[i]=in.nextInt();
       	   }
       Arrays.sort(arr);
       		for(int i=0;i<no;i++)
       		{
           		if(arr[i]==arr[(i+1)%n]){
                   		System.out.println(arr[i]);
			}
       		}
	in.close();
           
   }
}