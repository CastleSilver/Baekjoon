import java.util.Scanner;

public class Main {
//질문 검색에서 힌트를 얻었다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt5 = N/5;
		int cnt25 = N/25;
		int cnt125 = N/125;
		System.out.println(cnt5+cnt25+cnt125);
	}
}