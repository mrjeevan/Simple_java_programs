package convertDecimalToBinary;
import java.util.*;
public class ConvertDecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Input : Enter the number : ");
		n = sc.nextInt();
		int n2 = n;int r = 0,br = 0,k = 0;
		while(n2 != 0)
		{r = n2 % 2;
		 n2 = n2 / 2;
		 br = r + br*10;
		 k++;
		}
		// System.out.println(" br : "+br );
		// we need to reverse br to get actual binary num
		int b = 0;
		while(k != 0)
		{r = br % 10;
		 br = br / 10;
		 b = r + b*10;
		 k--;
		}
		System.out.println("Output : The binary value of "+n+" is : " +b);
		
	}

}
