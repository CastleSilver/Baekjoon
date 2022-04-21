import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		for(int r = 0; r < N; r++) {
			StringTokenizer stk = new StringTokenizer(br.readLine()," ");
			for(int c = 0; c < N ;c++) {
				map[r][c] = Integer.parseInt(stk.nextToken());
			}
		}
		for(int t = 0 ; t < N; t++) {//몇 번 노드를 거쳐갈 지 정하기
			for(int r = 0; r < N ; r++) {
				if(t == r) continue;
				for(int c = 0; c < N; c++) {
					//직접 가는 길은 없었는데 다른 노드를 거쳐 가는 길이 존재하면 나도 길이 있는 거임
					if(map[r][c] == 0 && map[r][t] == 1 && map[t][c] == 1)
						map[r][c] = 1;
				}
			}
		}
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < N ;c++) {
				sb.append(map[r][c]).append(" ");
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}