import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		Stack<Character> stk = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			// 문자면 바로 sb에 저장
			if(arr[i] >= 'A' && arr[i] <= 'Z')
				sb.append(arr[i]);
			// 열린 괄호 넣어주기
			else if(arr[i] == '(') {
				stk.add(arr[i]);
			}
			// 닫힌 괄호면 열린 괄호 나올 때까지 sb에 넣어주기
			else if(arr[i] == ')') { 
				int j = stk.size() - 1;
				while(true) {
					if(stk.get(j) == '(') {
						stk.remove(j);
						break;
					}
					sb.append(stk.remove(j--));
				}
			}
			// 곱하기나 나누기면 flag = true 로 바꿔주고 q에 저장
			else if(arr[i] == '*' || arr[i] == '/') {
				if(!stk.isEmpty() && (stk.peek()=='*' || stk.peek() == '/'))
					sb.append(stk.pop());
				stk.add(arr[i]);
			}
			// 더하기나 빼기일때..
			else if(arr[i] == '+' || arr[i] == '-') {
				// 괄호 안에 있으면 괄호 안에 있는 거 까지, 아니면 스택 빌때까지 sb에 넣어주기
				int j = stk.size() - 1;
				while(true) {
					if(j < 0) break;
					if(stk.get(j) == '(') 
						break;
					sb.append(stk.remove(j--));
				}
				stk.add(arr[i]);
			}
		}
		while(!stk.isEmpty())
			sb.append(stk.pop());
		System.out.println(sb.toString());
	}

}