import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean[] check = new boolean[20000001];
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			check[sc.nextInt() + 10000000] = true;
		}
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			if(check[sc.nextInt() + 10000000])
				sb.append(1).append(" ");
			else
				sb.append(0).append(" ");
		}
		System.out.println(sb);
	}

}
