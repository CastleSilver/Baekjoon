import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		char[] B = sc.next().toCharArray();
		int ans1 = A * (B[2] - '0');
		int ans2 = A * (B[1] - '0');
		int ans3 = A * (B[0] - '0');
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans1+ans2*10+ans3*100);
	}
}