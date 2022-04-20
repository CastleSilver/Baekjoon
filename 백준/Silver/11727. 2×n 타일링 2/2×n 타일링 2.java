import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//f(1) = 1, f(2) = 3, f(n) = f(n-1)+2*f(n-2);
		int[] arr = new int[N+2];
		arr[1] = 1;
		arr[2] = 3;
		for(int i = 3; i <= N; i++) {
			arr[i] = (arr[i-1]+2*arr[i-2])%10007;
		}
		System.out.println(arr[N]);
	}

}