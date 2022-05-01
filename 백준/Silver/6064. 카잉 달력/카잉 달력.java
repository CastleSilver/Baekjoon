import java.util.Scanner;

public class Main {
//나머지 개념을 생각을 못했었네..
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T ; tc++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int ans = x;
			while(true) {
				if(ans > M*N) {
					System.out.println(-1);
					break;
				}
				if( ans % N == y || (ans % N == 0 && N == y )) {
					System.out.println(ans);
					break;
				}
				ans += M;
			}
		}
	}

}