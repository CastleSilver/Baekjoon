import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A == 0 && B == 0) break;
			sb.append(A+B).append("\n");
		}
		System.out.println(sb.toString());
	}
}