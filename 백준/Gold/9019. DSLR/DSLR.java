import java.util.*;
import java.util.Queue;

public class Main {
//이런 문제도 BFS구나..
//문제만 보고 완탐인 줄 알았는데 아니었다
static int B;
static String ans;
static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			B = sc.nextInt();
			visited = new boolean[10000];
			visited[A] = true;
			Queue<Number> q = new LinkedList<>();
			q.add(new Number(A, ""));
			ans = "";
			while(!q.isEmpty()) {
				Number n = q.poll();
				if(n.num == B) {
					System.out.println(n.order);
					break;
				}
				if(!visited[n.D()]) {
					q.add(new Number(n.D(), n.order+"D"));
					visited[n.D()] = true;
				}
				if(!visited[n.S()]) {
					q.add(new Number(n.S(), n.order+"S"));
					visited[n.S()] = true;
				}
				if(!visited[n.L()]) {
					q.add(new Number(n.L(), n.order+"L"));
					visited[n.L()] = true;
				}
				if(!visited[n.R()]) {
					q.add(new Number(n.R(), n.order+"R"));
					visited[n.R()] = true;
				}
			}
			System.out.println(ans);
		}
	}
	static class Number{
		int num;
		String order;
		public Number(int num, String order) {
			super();
			this.num = num;
			this.order = order;
		}
		int D() {
			return (num*2) % 10000;
		}
		int S() {
            return num == 0 ? 9999 : num - 1;
        }

        int L() {
            return num % 1000 * 10 + num / 1000;
        }

        int R() {
            return num % 10 * 1000 + num / 10;
        }
	}
}
