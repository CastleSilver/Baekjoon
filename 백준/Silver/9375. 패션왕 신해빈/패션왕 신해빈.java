import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
//부분집합 함수 만들어서 재귀 보내니까 시간초과 난다
//구글링 해서 겨우 풀었다..
// 옷 종류를 기준으로 조합을 구하는 건 맞는데, 안입는 경우를 생각해서 해당 사이즈에 +1을 해준 후 곱해야한다
static int cnt;
static Map<String, Integer> cloth;
static List<String> arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			cloth = new HashMap<>();
			arr = new ArrayList<>();
			int M = Integer.parseInt(br.readLine());
			for(int i = 0; i < M ;i++) {
				StringTokenizer stk = new StringTokenizer(br.readLine()," ");
				String v = stk.nextToken();
				String k = stk.nextToken();
				cloth.put(k, cloth.getOrDefault(k, 0)+1);
				if(!arr.contains(k))
					arr.add(k);
			}
			cnt = 1;
			int n = arr.size();
			//아예 안입는 경우 제외해주기
			for(int i = 0 ; i < n; i++) {
				cnt *= cloth.get(arr.get(i))+1;
			}
			System.out.println(cnt-1);
		}
	}

}