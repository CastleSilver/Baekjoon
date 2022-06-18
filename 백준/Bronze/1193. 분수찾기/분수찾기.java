import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int cycle = 0;
		for(int i = 1; i < Integer.MAX_VALUE; i++) {
			sum += i;
			if(N <= sum ) {
				cycle = i;
				break;
			}
		}
		if(cycle%2 == 0)
			System.out.println((cycle-(sum-N))+"/"+(1+sum-N));
		else
			System.out.println((1+sum-N)+"/"+(cycle-(sum-N)));
	}
	

}