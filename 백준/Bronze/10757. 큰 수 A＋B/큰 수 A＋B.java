import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] n1 = sc.next().toCharArray();
		char[] n2 = sc.next().toCharArray();
		int len = n1.length > n2.length ? n1.length : n2.length;
		char[] num1 = new char[len];
		char[] num2 = new char[len];
		Arrays.fill(num1, '0');
		Arrays.fill(num2, '0');
		System.arraycopy(n1, 0, num1, len-n1.length, n1.length);
		System.arraycopy(n2, 0, num2, len-n2.length, n2.length);
		char[] ans = new char[len+1];
		int over = 0;
		for(int i = len-1; i >= 0; i--) {
			int sum = (num1[i] - '0') + (num2[i] - '0') + over;
			if(sum >= 10) {
				ans[i+1] = (sum%10+"").charAt(0);
				over = 1;
			}
			else {
				ans[i+1] = (sum+"").charAt(0);
				over = 0;
			}
		}
		ans[0] = (over+"").charAt(0);
		for(int i = 0; i < ans.length; i++) {
			if(i == 0 && ans[i] == '0') continue;
			System.out.print(ans[i]);
		}
		
	}
	

}