import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
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
		
		for(int tc = 0; tc < T ; tc++) {
			int N = sc.nextInt();
			int ans = 0;
			num = 2;
			while(true) {
				if(num > N/2) break;
				if(!check[N-num] && !check[num]) {
					ans = num;
				}
				num++;
			}
			System.out.println(ans + " " + (N-ans));
		}
	}
}