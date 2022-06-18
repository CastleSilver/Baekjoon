import java.util.Scanner;

public class Main {
	static boolean[] check = new boolean[10001];
	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			d(i, 0);
		}
		for(int i = 1; i <= 10000; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}
	public static void d(int num, int cnt) {
		if(num > 10000) return;
		if(cnt != 0)
			check[num] = true;
		int next = num + (num/10000)%10 + (num/1000)%10 + (num/100)%10 + (num/10)%10 + num%10;
		d(next, cnt + 1);
	}
}