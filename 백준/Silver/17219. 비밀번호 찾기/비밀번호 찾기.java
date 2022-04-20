import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		TreeMap<String, String> map = new TreeMap<>();
		for(int i = 0; i < N ;i++) {
			stk = new StringTokenizer(br.readLine()," ");
			map.put(stk.nextToken(), stk.nextToken());
		}
		for(int i = 0; i < M ; i++) {
			bw.append(map.get(br.readLine()));
			if(i != M-1)
				bw.append("\n");
		}
		bw.flush();
	}

}