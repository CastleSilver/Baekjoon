import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int X = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a < X)
				sb.append(a+" ");
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}
}