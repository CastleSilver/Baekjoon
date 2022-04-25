import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
//+는 무조건 먼저 계산 해주고 -를 나중에해야 한다는 건 알겠는데
// 방법을 모르겠어서 계속 고민하다가 구선생님 도움을 받았다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 먼저 -를 기준으로 구분 지어준다
		StringTokenizer stk = new StringTokenizer(br.readLine(),"-");
		int ans = Integer.MAX_VALUE;
		while(stk.hasMoreTokens()) {
			int sum = 0;
			//그 다음 +를 기준으로 구분 지어준다
			StringTokenizer add = new StringTokenizer(stk.nextToken(),"+");
			//나뉜 애들을 모두 더한다
			while(add.hasMoreTokens()) {
				sum += Integer.parseInt(add.nextToken());
			}
			//첫 번째 값일 경우 대입
			if(ans == Integer.MAX_VALUE)
				ans = sum;
			else
				ans -= sum;
		}
		System.out.println(ans);
	}
}