
package compoundInterst;
import java.lang.Math;
import java.util.*;
public class Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,p,r,n,t ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : Initial Principle Balance :");
		p = sc.nextFloat();
		System.out.print("Input : Intrest Rate :");
		r = sc.nextFloat();
		System.out.print("Input : number of times interest applied per time period :");
		n = sc.nextFloat();
		System.out.print("Input : number of time periods elapsed :");
		t = sc.nextFloat();
		a = p*Math.pow(1+(r/n),(n*t));
		System.out.println("Output : Final Amount :" +a);
		
		

	}

}
