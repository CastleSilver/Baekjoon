import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		M += T;		
		while(M >= 60) {
			M -= 60;
			H ++;
			if(H > 23) H = 0;
		}
		System.out.println(H + " " + M);
	}
}