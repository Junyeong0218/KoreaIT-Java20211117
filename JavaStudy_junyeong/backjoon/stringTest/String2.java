package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class String2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		br.close();
		char[] ch = sb.toString().toCharArray();
		sb.delete(0,  sb.length());
		
		for(int i=0; i<26; i++) {
			int index = -1;
			for(int j=0; j<ch.length; j++) {
				if(i+97 == ch[j]) {
					index = j;
					break;
				}
			}
			sb.append(index + " ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
