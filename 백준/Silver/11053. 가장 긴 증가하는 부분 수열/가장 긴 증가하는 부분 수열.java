import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0;i < N ;i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		
		for(int i = 0; i < N; i++) {
			dp[i] = 1;
			for(int j = 0; j < N; j++) {
				if(arr[j] < arr[i] && dp[i] < dp[j] + 1)
					dp[i] = dp[j] + 1;
			}
		}
		
		int max = 0;
		for(int a : dp)
			max = max > a ? max : a;
		System.out.println(max);
	}

}