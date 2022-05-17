import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M;
	//분류대로 브루트포스로 구현해 보려 한다..
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int[][] map = new int[N][M];
		
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
				map[r][c] = sc.nextInt();
			}
		}//입력 끝
		int ans = 0;
		// ㅡ, ㄱ, ㅗ => 3칸의 합을 구하고 튀어나온 부분 더해주기
		int[] dr = {0, -1, 1, -1, 1, -1, 1};
		int[] dc = {3, 2, 2, 0, 0, 1, 1};
		
		//가로로 3칸
		for(int r=0; r < N; r++) {
			for(int c = 0; c < M-2; c++) {
				int sum = 0;
				for(int i = 0; i < 3; i++) {
					sum += map[r][c+i]; 
				}
				//만들 수 있는 블록들 중에 최대값 구하기
				int tmp = 0;
				for(int i = 0; i < 7; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];
					if(!check(nr, nc)) continue;
					tmp = Math.max(tmp, map[nr][nc]);
				}
				ans = Math.max(ans, sum+tmp);
			}
		}
		//세로로 3칸
		for(int c=0; c < M; c++) {
			for(int r = 0; r < N-2; r++) {
				int sum = 0;
				for(int i = 0; i < 3; i++) {
					sum += map[r+i][c]; 
				}
				//만들 수 있는 블록들 중에 최대값 구하기
				int tmp = 0;
				for(int i = 0; i < 7; i++) {
					int nr = r + dc[i];
					int nc = c + dr[i];
					if(!check(nr, nc)) continue;
					tmp = Math.max(tmp, map[nr][nc]);
				}
				ans = Math.max(ans, sum+tmp);
			}
		}
		
		//ㅁ,ㄹ 같은 모양 => 2칸 합 구하고 나머지 블록 더해주기
		int[] dr2 = {1, 1, 1, 1, 1, 1};
		int[] dc2 = {0, 1, -1, 0, 1, 2};
		//가로 구하기
		for(int r = 0; r < N-1; r++) {
			for(int c = 0; c < M-1; c++) {
				int sum = map[r][c] + map[r][c+1];
				for(int i = 0; i < 6; i+=2) {
					int nr1 = r + dr2[i];
					int nc1 = c + dc2[i];
					int nr2 = r + dr2[i+1];
					int nc2 = c + dc2[i+1];
					if(check(nr1, nc1) && check(nr2, nc2)) {
						int tmp = map[nr1][nc1] + map[nr2][nc2];
						ans = Math.max(ans, sum + tmp);
					}
				}
			//세로 구하기
				sum = map[r][c] + map[r+1][c];
				for(int i = 2; i < 6; i+=2) {
					int nr1 = r + dc2[i];
					int nc1 = c + dr2[i];
					int nr2 = r + dc2[i+1];
					int nc2 = c + dr2[i+1];
					if(check(nr1, nc1) && check(nr2, nc2)) {
						int tmp = map[nr1][nc1] + map[nr2][nc2];
						ans = Math.max(ans, sum + tmp);
					}
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean check(int nr, int nc) {
		if(nr < 0 || nc <0 || nr >= N || nc >= M)
			return false;
		return true;
	}
}
