package armstrong_number;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,r;
		System.out.print("Input : Enter the number :");
		a = sc.nextInt();
		// System.out.println(" a : "+a);
		b = a;
		// System.out.println(" b : "+b);
		c = 0;
		while(b != 0)
		{r = b%10;
		 b = b/10;
		 c += r*r*r;
		}
		// System.out.println(" c : "+c);
		if(a == c)
		{
			System.out.print("Output : "+a +" is a armstrong number.");
		}
		else
		{
			System.out.print("Output : "+a +" is  NOT an armstrong number.");	
		}
	}
	

}
