package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		br.close();
		
		char[] ch = sb.toString().toCharArray();
		sb = null;
		
		int t = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] > 'V') {
				t += 10;
			} else if(ch[i] > 'S') {
				t += 9;
			} else if(ch[i] > 'O') {
				t += 8;
			} else if(ch[i] > 'L') {
				t += 7;
			} else if(ch[i] > 'I') {
				t += 6;
			} else if(ch[i] > 'F') {
				t += 5;
			} else if(ch[i] > 'C') {
				t += 4;
			} else {
				t += 3;
			}
		}
		
		bw.write(Integer.toString(t));
		bw.flush();
		bw.close();
	}
}