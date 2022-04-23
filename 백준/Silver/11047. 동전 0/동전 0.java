import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		int[] coin = new int[N];
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		//뒤부터 돌면서 최소 동전 개수 구하기
		int cnt = 0;
		for(int i = N-1; i >= 0; i--) {
			if(coin[i] <= K) {
				cnt += K/coin[i];
				K %= coin[i];
			}
		}
		System.out.println(cnt);
	}

}