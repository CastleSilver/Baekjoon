import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
//	1. 오직 숫자버튼만 부서진다
//	2. 버튼이 부서지지 않을 수 있다
//	3. 채널은 0번부터 무한대까지이다
//	4. 주어진 채널은 50만이 최대이지만, 50만 이상 번호의 채널로 갔다가 마이너스 버튼을 눌러서 원하는 채널로 가는게 가능하다(3번)
// 채널이 9999인데 9와 8버튼이 고장날 경우 100000로 갔다가 - 하는 것이 가장 빠르다
// 따라서 채널 길이만큼 result 길이를 정하면 안됨..
static int ans, len, N;
static boolean broken[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		ans = Math.abs(N-100); //지금 채널에서 + 혹은 -만 이용해서 이용한 값을 초기값으로 설정
		char[] arr = (N+"").toCharArray();
		len = arr.length;
		int M = Integer.parseInt(br.readLine());
		broken = new boolean[10];
		StringTokenizer stk = null;
		if(M != 0)
			stk = new StringTokenizer(br.readLine()," ");
		//고장난 버튼 입력 받기
		for(int i = 0; i < M; i++) {
			broken[Integer.parseInt(stk.nextToken())] = true;
		}
		//모든 숫자버튼이 고장날 수도 있지 않을까..
		if(M != 10) {
			if(len>1)
				move(0, 0, 0, 2); //type 2 : 목표채널보다 한자리수 아래
			move(0, 0, 0, 1); //type 1 : 목표채널과 같은 자리수
			move(0, 0, 0, 0); //type 0 : 목표채널보다 한자리수 위
		}
		System.out.println(ans);
	}

	private static void move(int cnt, int idx, int ch, int type) {
		if(cnt >= ans) return;
		if(type == 2 && idx == len-1) {
			ans = Math.min(ans, cnt+Math.abs(N-ch));
			return;
		}
		if(type == 1 && idx == len) {
			ans = Math.min(ans, cnt+Math.abs(N-ch));
			return;
		}
		if(type == 0 && idx > len) {
			ans = Math.min(ans, cnt+Math.abs(N-ch));
			return;
		}
		for(int i = 0; i < 10; i ++) {
			if(!broken[i]) {
				int nch = (int) (ch + Math.pow(10, len-type-idx)*i);
				move(cnt + 1, idx + 1, nch, type);
			}
		}
	}

}