import java.util.Scanner;


public class Main {
static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ans = 1;
		recur(N);
	}
	private static void recur(int n) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		ans *= n;
		recur(n - 1);
	}
	
}
