import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
//플루이드 와샬 알고리즘을 이용해서 푸는 문제
//플루이드 와샬은 모든 정점에서 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		//인접행렬로 만들기
		//몇단계 거쳐야 하는지 기록
		int[][] dist = new int[N+1][N+1];
		//최대값으로 채워넣기
		for(int i = 1; i <= N; i++)
			Arrays.fill(dist[i], 987542);
		for(int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			dist[a][b] = 1;
			dist[b][a] = 1;
		}
		for(int t = 1; t <= N; t++) {
			for(int i = 1; i <= N ;i++) {
				if(t==i) continue;
				for(int j = 1; j <= N; j++) {
					if(i==j) continue;
					dist[i][j] = Math.min(dist[i][j], dist[i][t]+dist[t][j]);
				}
			}
		}
		int minidx = -1;
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= N; i++) {
			int tmp = 0;
			for(int j = 1; j <= N ; j++) {
				if(i != j)
					tmp += dist[i][j];
			}
			if(tmp < min) {
				min = tmp;
				minidx = i;
			}
		}
		System.out.println(minidx);
	}

}
