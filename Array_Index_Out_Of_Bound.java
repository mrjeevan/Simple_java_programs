package array_index_out_of_bound_exception;
import java.util.*;
public class Array_Index_Out_Of_Bound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.print("Input : Enter Length Of Array : ");
		n = sc.nextInt();
		int a[] = new int[n];  // must declare "int a[]" and not as int a = new....
		System.out.print("Input : Enter index > "+n+" : ");
		i = sc.nextInt();
		try 
		{
			System.out.println("Output : Array element : "+a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		 System.out.println("Output : Array_Index_Out_Of_Bound");
		 System.out.println("Error : " +e);
		}
		
	}

}
