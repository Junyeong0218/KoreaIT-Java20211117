package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		int t = Integer.parseInt(sb.toString());
		sb.delete(0, sb.length());
		
		for(int i=0; i<t; i++) {
			sb.append(br.readLine());
			StringTokenizer st = new StringTokenizer(sb.toString());
			sb.delete(0, sb.length());
			
			int r = Integer.parseInt(st.nextToken());
			char[] ch = st.nextToken().toCharArray();
			
			for(int j=0; j<ch.length; j++) {
				for(int k=0; k<r; k++) {
					sb.append(ch[j]);
				}
			}
			sb.append("\n");
			bw.write(sb.toString());
			sb.delete(0, sb.length());
		}
		
		bw.flush();
		bw.close();
	}
}
