import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
static char see[][], cant[][];
static int[] dr= {0, 0, 1, -1};
static int[] dc= {1, -1, 0, 0};
static boolean visited[][], visited2[][];
static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		see = new char[N][N];
		cant = new char[N][N];
		for(int i = 0; i < N ; i++) {
			see[i] = br.readLine().toCharArray();
		}
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < N; c++) {
				char tmp = see[r][c];
				//색약은 그린을 레드로 바꿔주기
				if(tmp == 'G')
					tmp = 'R';
				cant[r][c] = tmp;
			}
		}
		visited = new boolean[N][N];
		visited2 = new boolean[N][N];
		int ans = 0;
		int ans2 = 0;
		
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < N; c++) {
				if(!visited[r][c]) {
					dfs(r, c, see[r][c], 1);
					ans++;
				}
				if(!visited2[r][c]) {
					dfs(r, c, cant[r][c], 2);
					ans2++;
				}
			}
		}
		System.out.println(ans+" "+ans2);
	}
	private static void dfs(int r, int c, char val, int type) {
		if(type == 1) {
			//이미 방문한 곳이라면 return
			if(visited[r][c]) return;
			//아니라면 방문체크
			visited[r][c] = true;
		}
		else if(type ==2) {
			if(visited2[r][c]) return;
			visited2[r][c] = true;
		}
		for(int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
			if(type == 1) {
				if(see[nr][nc] == val)
					dfs(nr, nc, val, type);
			}
			else if(type == 2) {
				if(cant[nr][nc] == val)
					dfs(nr, nc, val, type);
			}
		}
			
	}

}