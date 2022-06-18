import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			char[] arr = sc.next().toCharArray();
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < N ; j ++) {
					sb.append(arr[i]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}