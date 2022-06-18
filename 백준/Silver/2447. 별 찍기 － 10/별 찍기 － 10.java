import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		arr = new char[N][N];
		int size = N/3;
		int cnt = 0;
		for(int i = 0; i < N; i+=size) {
			for(int j = 0; j < N; j+=size) {
				cnt++;
				if(cnt == 5) continue;
				print(i, j, size);
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] != '\u0000') { 
					sb.append(arr[i][j]);
				}
				else sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	private static void print(int i, int j, int size) {
		if(size == 1) {
			arr[i][j] = '*';
			return;
		}
		int cnt = 0;
		int nextSize = size/3;
		for(int r = i; r < i+size; r+=nextSize) {
			for(int c = j; c < j+size; c+= nextSize) {
				cnt++;
				if(cnt == 5) continue;
				print(r, c, size/3);
			}
		}
	}
}