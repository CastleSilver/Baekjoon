import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr= new int[N+1];
		for(int i = 1; i <= N ; i++) {
			arr[i] = sc.nextInt();
		}
		//누적합으로 배열 만들어 주기
		for(int i = 1; i <= N ; i++) {
			arr[i] += arr[i-1];
		}
		//답구하기
		//뒤에꺼 배열 값에서 앞에꺼-1 배열 빼주기
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sb.append(arr[b]-arr[a-1]).append("\n");
		}
		System.out.println(sb.toString());
	}

}
