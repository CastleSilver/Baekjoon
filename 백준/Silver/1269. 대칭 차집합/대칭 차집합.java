import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] check = new boolean[100000001];
		for(int i = 0; i < N ; i++) {
			check[sc.nextInt()] = true;
		}
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			if(check[num]) cnt++;
		}
		
		System.out.println((N+M) - 2*cnt);
	}

}
