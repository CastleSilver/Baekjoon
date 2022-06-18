import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[][] map = new boolean[M][N];
		int K = sc.nextInt();
		for(int i = 0; i < K; i++) {
			int y1 = sc.nextInt();
			int x1 = sc.nextInt();
			int y2 = sc.nextInt();
			int x2 = sc.nextInt();
			for(int r = x1; r < x2; r++) {
				for(int c = y1; c < y2; c++) {
					map[r][c] = true;
				}
			}
		}
		boolean[][] visited = new boolean[M][N];
		int[] dr = { 1, -1, 0, 0};
		int[] dc = { 0, 0, 1, -1};
		Queue<int[]> q = new LinkedList<>();
		int cnt = 0;
		int size = 0;
		for(int r = 0; r < M; r++) {
			for(int c = 0; c < N; c++) {
				if(!map[r][c] && !visited[r][c]) {
					int[] tmp = new int[] {r, c};
					q.add(tmp);
					cnt++;
					while(!q.isEmpty()) {
						tmp = q.poll();
						int x = tmp[0];
						int y = tmp[1];
						if(visited[x][y]) continue;
						visited[x][y] = true;
						size++;
						for(int i = 0; i < 4; i++) {
							int nr = x + dr[i];
							int nc = y + dc[i];
							if(nr < 0 || nc < 0 || nr >= M || nc >= N || visited[nr][nc] || map[nr][nc])
								continue;
							q.add(new int[] {nr, nc});
						}
					}
					list.add(size);
					size = 0;
				}
			}
		}
		sb.append(cnt).append("\n");
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+" ");
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}
}
