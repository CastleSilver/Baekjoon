import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
//stringBuilder 이용해서 풀었더니 시간초과났다..
// 분류에 덱이 있길래 덱을 이용해 풀어보았는데
//출력 과정에서 애를 많이 먹었다.. ㅠㅠ 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			StringBuilder sb = new StringBuilder();
			Deque<Integer> dq = new LinkedList<>();
			char[] order = br.readLine().toCharArray(); //명령 입력받기
			int N = Integer.parseInt(br.readLine()); //숫자 수
			//stringTokenizer는 자르고 싶은 기준을 여러개 둘 수 있다는 것을 배웠다
			StringTokenizer stk = new StringTokenizer(br.readLine(),"[],");
			while(stk.hasMoreTokens()) {
				dq.add(Integer.parseInt(stk.nextToken()));
			}
			
			//size 측정
			int size = N;
			boolean error = false;
			boolean sort = false; 
			out: for(int i = 0; i < order.length; i++) {
				char ch = order[i];
				switch (ch) {
				//반대방향으로 바꾸기
				case 'R':
					sort = !sort;
					break;
				case 'D':
					//size가 0일 경우 error 넣어주고 빠져나오기
					if(size == 0) {
						sb.append("error");
						error = true;
						break out;
					}
					//정방향일 경우
					if(!sort) {
						dq.removeFirst();
					}
					//역방향일 경우
					else {
						dq.removeLast();
					}
					size--;
					break;
				}
			}
			//error가 아니라면
			if(!error) {
				sb.append("[");
				//역방향이었으면 뒤부터 넣어주기
				if(sort) {
					while(!dq.isEmpty()) {
						sb.append(dq.removeLast()).append(",");
					}
				}
				//정방향이었으면 앞부터 넣어주기
				else {
					while(!dq.isEmpty()) {
						sb.append(dq.remove()).append(",");
					}
				}
				//마지막 , 지워주기
				//빈괄호가 들어오는 경우 때문에 N이 1이상이고, sb길이가 2이상이어야지만 ,를 빼줘야 한다.
				if(N > 0 && sb.length()>1)
					sb.setLength(sb.length()-1);
				sb.append("]");
			}
			System.out.println(sb.toString());
		}
	}

}