import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] n1 = sc.next().toCharArray();
		char[] n2 = sc.next().toCharArray();
		out: for(int i = 2; i >= 0; i--) {
			if(n1[i] > n2[i]) {
				for(int j = 2; j>=0; j--) {
					System.out.print(n1[j]);
				}
				break out;
			}
			else if(n1[i] < n2[i]) {
				for(int j = 2; j>=0; j--) {
					System.out.print(n2[j]);
				}
				break out;
			}
		}
	}

}