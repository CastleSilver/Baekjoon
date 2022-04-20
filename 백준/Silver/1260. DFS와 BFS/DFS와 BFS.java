import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
static int N;
static StringBuilder sb;
static List<Integer>[] list;
static boolean visited[];
static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int V = Integer.parseInt(stk.nextToken());
		list = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0 ; i< M; i++) {
			stk = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		for(int i = 1; i <= N; i++) {
			Collections.sort(list[i]);
		}
		visited = new boolean[N+1];
		dfs(V);
		sb.setLength(sb.length()-1);
		sb.append("\n");
		
		q = new LinkedList<Integer>();
		visited = new boolean[N+1];
		q.add(V);
		bfs();
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}
	private static void dfs(int v) {
		sb.append(v).append(" ");
		visited[v] = true;
		for(int i = 0; i < list[v].size(); i++) {
			int num = list[v].get(i);
			if(!visited[num])
				dfs(num);
		}
	}
	private static void bfs() {
		if(q.isEmpty()) return;
		int v = q.poll();
		visited[v] = true;
		sb.append(v).append(" ");
		for(int i = 0; i < list[v].size(); i++) {
			int num = list[v].get(i);
			if(!visited[num]) {
				visited[num] = true;
				q.add(list[v].get(i));
			}
		}
		bfs();
	}

}