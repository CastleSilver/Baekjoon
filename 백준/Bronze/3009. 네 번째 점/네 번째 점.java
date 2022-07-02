import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
static int ans;
static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();
		int l3 = sc.nextInt();
		int r3 = sc.nextInt();
		if(l2 == l1)
			System.out.print(l3);
		else if(l1 == l3)
			System.out.print(l2);
		else
			System.out.print(l1);
		System.out.print(" ");
		if(r2 == r1)
			System.out.print(r3);
		else if(r1 == r3)
			System.out.print(r2);
		else
			System.out.print(r1);
 	}
}