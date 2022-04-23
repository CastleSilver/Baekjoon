import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//p(1)=1, p(2)=1, p(3)=1,p(4)=p(1)+p(3),p(5)=p(4)
		//p(6)=p(1)+p(5), p(7)=p(6)+p(2), p(8)=p(7)+p(3)
		//배열 만들어주기
		long[] arr = new long[101];
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 2;
		for(int i = 6; i <= 100; i++)
			arr[i] = arr[i-1] + arr[i-5];
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			sb.append(arr[N]).append("\n");
		}
		System.out.println(sb.toString());
	}

}