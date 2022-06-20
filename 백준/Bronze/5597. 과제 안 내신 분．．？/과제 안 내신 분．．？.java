import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[31];
		for(int i = 0; i < 28; i++) {
			check[sc.nextInt()] = true;
		}
		
		for(int i = 1; i <= 30; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}

}