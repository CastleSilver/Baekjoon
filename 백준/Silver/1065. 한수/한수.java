import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= N ;i++) {
			if(isHan((i+"").toCharArray())) cnt++;
		}
		System.out.println(cnt);
	}

	private static boolean isHan(char[] arr) {
		if(arr.length == 1)
			return true;
		else {
			int len = arr[0] - arr[1];
			for(int i = 2; i < arr.length; i++) {
				if(arr[i - 1] - arr[i] != len)
					return false;
			}
		}
		return true;
	}

}