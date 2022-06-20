import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int cnt = 0;
		boolean flag = false;
		for(int i = 1; i <= N; i++) {
			if(N%i == 0) cnt++;
			if(cnt == K) {
				flag = true;
				System.out.println(i);
				break;
			}
		}
		if(!flag)
			System.out.println(0);
	}

}