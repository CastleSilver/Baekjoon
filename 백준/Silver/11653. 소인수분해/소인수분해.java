import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] check = new boolean[10000001];
		
		int num = 2;
		int mtp = 2;
		while(true) {
			if(num * mtp > 10000000) {
				num++;
				mtp = 2;
				continue;
			}
			if(num > 10000000) break;
			check[num * mtp] = true;
			mtp++;
		}
		check[1] = true;
		
		num = 2;
		while(true) {
			if(N == 1) break;
			if(!check[N]) {
				System.out.println(N);
				break;
			}
			if(N % num == 0) {
				System.out.println(num);
				N /= num;
			}
			else num ++;
		}
	}
}