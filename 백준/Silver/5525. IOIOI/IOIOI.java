import java.util.Scanner;

public class Main {
//범위가 각각 백만이라 어떻게 구해야 시간초과가 안날까..
//50점 맞음..
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		String ans = "";
//		//정답 문자열 만들어 주기
//		for(int i = 0; i <= 2*N; i++) {
//			if(i%2== 0)
//				ans+="I";
//			else
//				ans+="O";
//		}
//		String s = sc.next();
//		int cnt = 0;
//		for(int i = 0; i < M-2*N; i++) {
//			if(s.charAt(i) == 'I') {
//				if(s.substring(i, i+2*N + 1).equals(ans))
//					cnt++;
//			}
//		}
//		System.out.println(cnt);
//	}
// 찾아보니까 KMP라는 문자열 탐색 알고리즘을 이용하라고 나와 있어서 공부해보았다
//문자열을 일일이 찾으면 O(N*M)의 시간 복잡도가 발생하는데 KMP를 이용하면 O(N+M)만에 해결가능하다고 한다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		//정답 문자열 만들어 주기
		char[] pattern = new char[2*N+1];
		for(int i = 0; i <= 2*N; i++) {
			if(i%2== 0)
				pattern[i] = 'I';
			else
				pattern[i] = 'O';
		}
		char[] s = sc.next().toCharArray();
		int cnt = 0;
		int i = 0;
		int j = 0;
		while(i < M) {
			//끝까지 동일하면 cnt증가시키고 j는 3칸 앞당겨서 검사
			if(j == 2*N+1) {
				cnt++;
				i--;
				j -= 3;
				continue;
			}
			//패턴이 같으면 둘다 인덱스 증가
			if(s[i] == pattern[j]) {
				i++;
				j++;
				continue;
			}
			//패턴 다르면
			//j가 홀수인덱스에서 다르다는 것은 s가 I라는 말이니까 거기부터 다시 탐색
			//아니면 한자리 앞당겨서 탐색
			else {
				if(j%2 == 0) {
					i++;
				}
				j = 0 ;
			}
		}
		System.out.println(cnt);
	}
}