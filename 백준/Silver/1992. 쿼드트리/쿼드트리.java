import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
static boolean map[][];
static StringBuilder sb;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		map = new boolean[N][N];
		for(int i = 0; i < N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j = 0; j < N; j++) {
				if(tmp[j] == '1')
					map[i][j] = true;
			}
		}//입력 끝
		if(!check(0, 0, N))
			cut(0, 0, N/2);
		System.out.println(sb.toString());
	}
	private static void cut(int sr, int sc, int n) {
		sb.append("(");
		//section 1
		if(!check(sr, sc, n))
			cut(sr,sc,n/2);
		//section 2
		if(!check(sr, sc+n, n))
			cut(sr,sc+n,n/2);
		//section 3
		if(!check(sr+n, sc, n))
			cut(sr+n,sc,n/2);
		//section 4
		if(!check(sr+n, sc+n, n))
			cut(sr+n,sc+n,n/2);
		sb.append(")");
	}
	private static boolean check(int sr, int sc, int n) {
		boolean flag = map[sr][sc];
		for(int i = sr; i < sr+n; i++) {
			for(int j = sc; j < sc+ n; j++) {
				if(map[i][j] != flag) return false;
			}
		}
		if(flag)
			sb.append(1);
		else 
			sb.append(0);
		return true;
	}

}