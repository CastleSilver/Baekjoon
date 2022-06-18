import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[1000001];
		int num = 2;
		int mtp = 2;
		while(true) {
			if(num * mtp > 1000000) {
				num++;
				mtp = 2;
				continue;
			}
			if(num > 1000000) break;
			check[num * mtp] = true;
			mtp++;
		}
		check[1] = true;
		
		while(true) {
			int N = sc.nextInt();
			if(N == 0) break;
			int cnt = 0;
			for(int i = N+1; i <= 2*N ; i++) {
				if(!check[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
}