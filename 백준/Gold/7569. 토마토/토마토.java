import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
static int tomato[][][], M, N, H, notGood;
static int[] dr = {0, 0, 1, -1};
static int[] dc = {1, -1, 0, 0};
static int[] dh = {1, -1};
static class Pos{
	int r, c, h;

	public Pos(int r, int c, int h) {
		super();
		this.r = r;
		this.c = c;
		this.h = h;
	}
	
}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		M = Integer.parseInt(stk.nextToken());
		N = Integer.parseInt(stk.nextToken());
		H = Integer.parseInt(stk.nextToken());
		tomato = new int[N][M][H];
		notGood = 0;
		Queue<Pos> q = new LinkedList<>();
		for(int h = 0; h<H; h++) {
			for(int n = 0; n <N; n++) {
				stk = new StringTokenizer(br.readLine()," ");
				for(int m = 0; m <M; m++) {
					tomato[n][m][h] = Integer.parseInt(stk.nextToken());
					//익어야할 토마토 세주고, 익은 토마토 큐에 넣어주기
					if(tomato[n][m][h]==0) notGood++;
					else if(tomato[n][m][h]==1) 
						q.add(new Pos(n, m, h));
				}
			}
		}
		boolean flag = false;
		//이미 다 익어있는 경우
		if(notGood == 0)
			flag = true;
		
		int day = 1;
		while(!q.isEmpty()) {
			Pos pos = q.poll();
			day = tomato[pos.r][pos.c][pos.h];
			//상하좌우 다녀오기
			for(int i = 0; i < 4; i++) {
				int nr = pos.r + dr[i];
				int nc = pos.c + dc[i];
				if(nr < 0 || nc < 0 || nr >= N || nc >= M || tomato[nr][nc][pos.h] != 0)
					continue;
				tomato[nr][nc][pos.h] = tomato[pos.r][pos.c][pos.h] + 1;
				notGood--;
				q.add(new Pos(nr, nc, pos.h));
			}
			//위아래 갔다오기
			for(int i = 0; i < 2; i++) {
				int nh = pos.h + dh[i];
				if(nh >= 0 && nh < H && tomato[pos.r][pos.c][nh] == 0) {
					tomato[pos.r][pos.c][nh] = tomato[pos.r][pos.c][pos.h] + 1;
					notGood--;
					q.add(new Pos(pos.r, pos.c, nh));
				}				
			}
		}
		if(flag)
			System.out.println(0);
		else {
			if(notGood != 0)
				System.out.println(-1);
			else
				System.out.println(day-1);
		}
	}

}