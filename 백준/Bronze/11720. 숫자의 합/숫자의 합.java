import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int ans = 0;
		for(int i = 0; i < N ; i++) {
			ans += arr[i] - '0';
		}
		System.out.println(ans);
	}

}