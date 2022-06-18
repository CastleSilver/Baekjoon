import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fixCost = sc.nextInt();
		int cost = sc.nextInt();
		int price = sc.nextInt();
		int profit = price - cost;
		if(profit <= 0)
			System.out.println(-1);
		else {
			System.out.println(fixCost/profit + 1);
		}
	}

}