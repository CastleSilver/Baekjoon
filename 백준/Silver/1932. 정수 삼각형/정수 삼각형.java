import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i ; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				map[i][j] = Math.max(map[i][j]+map[i-1][j-1], map[i][j]+map[i-1][j]);
			}
		}
		
		int max = 0;
		for(int j = 1; j <=N; j++) {
			max = Math.max(max, map[N][j]);
		}
		
		System.out.println(max);
	}

}