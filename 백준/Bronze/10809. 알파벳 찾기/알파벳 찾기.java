import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] check = new int[26];
		Arrays.fill(check, -1);
		char[] arr = sc.next().toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(check[arr[i]-'a'] == -1)
				check[arr[i]-'a'] = i;
		}
		for(int i = 0; i < 26; i++) {
			System.out.print(check[i]+" ");
		}
	}

}