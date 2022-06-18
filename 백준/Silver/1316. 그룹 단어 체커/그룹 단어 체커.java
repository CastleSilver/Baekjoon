import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = N;
		next : for(int t = 0; t < N; t++) {
			char[] arr = sc.next().toCharArray();
			int[] check = new int[26];
			char ch = arr[0];
			check[ch-'a']++;
			for(int i = 1; i < arr.length; i++) {
				if(ch != arr[i]) {
					ch = arr[i];
					if(check[ch - 'a'] != 0) {
						ans--;
						continue next;
					}
					check[ch - 'a']++;
				}
			}
		}
		System.out.println(ans);
	}

}