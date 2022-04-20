import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
static int map[][], minus, zero, plus;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for(int i = 0; i< N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		minus = 0;
		zero = 0;
		plus = 0;
		if(!check(0, 0, N))
			cut(0,0,N/3);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
	}
	private static void cut(int sr, int sc, int n) {
		//section1
		if(!check(sr, sc, n))
			cut(sr,sc,n/3);
		//section2
		if(!check(sr, sc+n, n))
			cut(sr,sc+n,n/3);
		//section3
		if(!check(sr, sc+2*n, n))
			cut(sr,sc+2*n,n/3);
		//section4
		if(!check(sr+n, sc, n))
			cut(sr+n,sc,n/3);
		//section5
		if(!check(sr+n, sc+n, n))
			cut(sr+n,sc+n,n/3);
		//section6
		if(!check(sr+n, sc+2*n, n))
			cut(sr+n,sc+2*n,n/3);
		//section7
		if(!check(sr+2*n, sc, n))
			cut(sr+2*n,sc,n/3);
		//section8
		if(!check(sr+2*n, sc+n, n))
			cut(sr+2*n,sc+n,n/3);
		//section9
		if(!check(sr+2*n, sc+2*n, n))
			cut(sr+2*n,sc+2*n,n/3);
	}
	private static boolean check(int sr, int sc, int n) {
		int flag = map[sr][sc];
		for(int i = sr; i< sr+n; i++) {
			for(int j = sc; j < sc+n; j++) {
				if(flag != map[i][j]) return false;
			}
		}
		if(flag == -1) minus++;
		else if(flag == 0) zero++;
		else plus++;
		return true;
	}

}