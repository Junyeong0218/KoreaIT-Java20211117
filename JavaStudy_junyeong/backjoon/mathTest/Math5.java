package mathTest;

import java.io.*;
import java.util.StringTokenizer;

public class Math5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(sb.append(br.readLine()).toString());
		sb.delete(0, sb.length());
		
		for(int i=0; i<t; i++) {
			sb.append(br.readLine());
			StringTokenizer st = new StringTokenizer(sb.toString());
			sb.delete(0, sb.length());
			
			int h = Integer.parseInt(st.nextToken()); st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			if(n%h == 0) {
				sb.append(Integer.toString((h*100) + (n/h)));
			} else {
				sb.append(Integer.toString(((n%h)*100) + ( (n/h) + 1 ) ));
			}
			bw.write(sb.toString() + '\n');
			sb.delete(0, sb.length());
			
		}
		bw.flush();
		bw.close();
	}
}
