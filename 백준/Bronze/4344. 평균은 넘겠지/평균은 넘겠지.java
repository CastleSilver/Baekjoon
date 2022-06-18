import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] stu = new int[N];
			int sum = 0;
			for(int i = 0; i < N ; i++) {
				stu[i] = sc.nextInt();
				sum += stu[i];
			}
			double avg = (double) sum / N;
			int cnt = 0;
			for(int i = 0; i < N ; i++) {
				if(stu[i] > avg) cnt++;
			}
			sb.append(String.format("%.3f", (float)cnt/N*100));
			sb.append("%\n");
		}
		System.out.println(sb.toString());
	}
}