import java.util.Scanner;

public class Main {
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Fibonnazi(sc.nextInt()));
	}

	private static int Fibonnazi(int num) {
		if(num == 0) {
			return 0;
		}
		if(num == 1) {
			return 1;
		}
		return Fibonnazi(num - 1) + Fibonnazi(num - 2);
	}
}