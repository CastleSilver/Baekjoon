import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cnt = new int[201];
		for(int i = 0; i < N ;i++) {
			cnt[sc.nextInt()+100]++;
		}
		System.out.println(cnt[sc.nextInt()+100]);
	}

}