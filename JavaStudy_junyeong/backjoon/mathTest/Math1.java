package mathTest;

import java.io.*;
import java.util.StringTokenizer;

public class Math1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		StringTokenizer st = new StringTokenizer(sb.toString());
		sb.delete(0, sb.length());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int ea = 1;
		int profit = -1;
		int dif = c-b;
		
		if(dif > 0) {
			ea = a / dif + 1;
			profit = 1;
		}
		
		if(profit>0) {
			sb.append(ea);
		} else {
			sb.append(profit);			
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
