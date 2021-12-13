package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class String8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		char[] ch = sb.append(br.readLine()).toString().toCharArray();
		int cnt = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(i == ch.length-1) {
				cnt++;
			} else {
				if(ch[i] == 'c' && ch[i+1] == '=' || ch[i] == 'c' && ch[i+1] == '-') {
					cnt++;
					i++;
				} else if(ch[i] == 'l' && ch[i+1] == 'j') {
					cnt++;
					i++;
				} else if(ch[i] == 'n' && ch[i+1] == 'j') {
					cnt++;
					i++;
				} else if(ch[i] == 's' && ch[i+1] == '=') {
					cnt++;
					i++;
				} else if(ch[i] == 'z' && ch[i+1] == '=') {
					cnt++;
					i++;
				} else if(ch[i] == 'd' && ch[i+1] == '-') {
					cnt++;
					i++;
				} else if(ch[i] == 'd' && i < ch.length-2) {
					if(ch[i+1] == 'z' && ch[i+2] == '=') {
						cnt++;
						i += 2;
					} else {
						cnt++;
					}
				} else {
					cnt++;
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}