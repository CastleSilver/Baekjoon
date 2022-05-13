import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> nq = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++ ) {
			int num = Integer.parseInt(br.readLine());
			//숫자가 0이 아니면 q에 넣어주기
			if(num != 0) {
				//음수 양수 구분해서 넣어주기
				if(num < 0)
					nq.add(num);
				else
					pq.add(num);
			}
			// 0이면 꺼내주기
			else {
				//둘 다 비었으면 0 출력하기
				if(nq.isEmpty() && pq.isEmpty()) {
					sb.append(0).append("\n");
					continue;
				}
				if(pq.isEmpty()) {
					sb.append(nq.remove()).append("\n");
					continue;
				}
				if(nq.isEmpty()) {
					sb.append(pq.remove()).append("\n");
					continue;
				}
				//절댓값 같거나 nq절대값이 더 작으면 음수 꺼내주기
				if(Math.abs(nq.peek()) <= pq.peek()) {
					sb.append(nq.remove()).append("\n");
					continue;
				}
				else if(Math.abs(nq.peek()) > pq.peek()){
					sb.append(pq.remove()).append("\n");
					continue;
				}
			}
		}
		System.out.println(sb.toString());
	}

}
