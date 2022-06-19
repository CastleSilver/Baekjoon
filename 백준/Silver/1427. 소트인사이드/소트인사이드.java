import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		int[] arr = new int[ch.length];
		for(int i = 0; i < ch.length; i++) {
			arr[i] = ch[i] -'0';
		}
		Arrays.sort(arr);
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}
