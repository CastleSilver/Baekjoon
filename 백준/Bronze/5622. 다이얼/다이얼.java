import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			int ch = arr[i] - 'A';
			if(ch < 15) {
				ans += ch/3 + 3;
			}
			else if (ch <= 18){
				ans += 8;
			}
			else if (ch <= 21)
				ans += 9;
			else ans += 10;
		}
		System.out.println(ans);
	}

}