package problemsolveing;

import java.util.Scanner;

public class valsumorsub {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,s = 0;
		do {
			System.out.println("Enter n :");
			n= in.nextInt();
		}while(n<=0);
		
		for(int i =0; i<=n;i++) {
			if ( i % 2==1) {
				s-=i;
			}else
			{
				s+=i;
			}
		}
		System.out.println("valsumorsub"+s);
	}

}
