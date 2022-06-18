import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] check = new boolean[10001];
		
		int num = 2;
		int mtp = 2;
		while(true) {
			if(num * mtp > 10000) {
				num++;
				mtp = 2;
				continue;
			}
			if(num > 10000) break;
			check[num * mtp] = true;
			mtp++;
		}
		check[1] = true;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(!check[i]) {
				sum += i;
				min = min < i ? min : i;
			}
		}
		if(min == Integer.MAX_VALUE)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}