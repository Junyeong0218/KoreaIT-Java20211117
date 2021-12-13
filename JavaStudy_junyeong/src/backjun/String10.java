package backjun;

import java.io.*;

public class String10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int prev = 0;
			boolean[] exist = new boolean[26];
			char[] ch = br.readLine().toString().toCharArray();
			boolean isGroup = true;
			
			for(int j=0; j<ch.length; j++) {
				
				if(ch[j] != prev) {
					
					if(exist[ch[j] - 97] == false) {
						exist[ch[j] - 97] = true;
						prev = ch[j];
					} else {
						isGroup = false;
						break;
					}
				} else {
					continue;
				}
			}
			
			if(isGroup) {
				cnt++;
			}
		}
		
		br.close();
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}
