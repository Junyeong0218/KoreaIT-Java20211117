package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		char[] ch = sb.toString().toCharArray();
		br.close();
		sb.delete(0, sb.length());
		
		int[] cnt = new int[26];
		int max = 0;
		
		for(int i=0; i<26; i++) {
			for(int j=0; j<ch.length; j++) {
				if(i+65 == ch[j] || i+97 == ch[j]) {
					cnt[i]++;
				}
			}
			if(cnt[i] > max) {
				max = cnt[i];
			}
		}
		
		int cnt2 = 0;
		int index = 0;
		
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i] == max) {
				cnt2++;
				index = i;
			}
		}
		
		if(cnt2 > 1) {
			bw.write("?");
		} else {
			bw.write((char)(index + 65));
		}
		bw.flush();
		bw.close();
	}
}
