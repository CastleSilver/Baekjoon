import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i< N; i++) {
			map.put(sc.next(), 1);
		}
		
		int cnt = 0;
		for(int i = 0; i < M ; i++) {
			if(map.containsKey(sc.next())) cnt++;
		}
		System.out.println(cnt);
	}

}