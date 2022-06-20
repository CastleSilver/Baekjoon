import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 0)
			System.out.println(0);
		else if (N == 1)
			System.out.println(1);
		else {
			long[] arr = new long[N+1];
			arr[0] = 0;
			arr[1] = 1;
			for(int i = 2; i <= N; i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
			System.out.println(arr[N]);
		}
	}

}