package mathTest;

import java.io.*;
import java.util.StringTokenizer;

public class Math4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		StringTokenizer st = new StringTokenizer(sb.toString());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		if((v-b)%(a-b) != 0) {
			cnt = (v-b)/(a-b) + 1;
		} else {
			cnt = (v-b)/(a-b);
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
		
	}
}
