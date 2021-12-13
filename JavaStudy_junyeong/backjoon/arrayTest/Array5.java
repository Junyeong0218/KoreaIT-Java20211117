package arrayTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] in = new String[n];
		
		for(int i=0; i<in.length; i++) {
			in[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<in.length; i++) {
			int lineScore = 0;
			int lastIndex = 0;
			if(in[i].lastIndexOf("X") > in[i].lastIndexOf("O")) {
				lastIndex = in[i].lastIndexOf("X") + 1;
			} else {
				lastIndex = in[i].lastIndexOf("O") + 1;
			}
			
			char[] ch = new char[lastIndex];
			for(int j=0; j<lastIndex; j++) {
				ch[j] = in[i].charAt(j);
			}
			
			int k = 0;
			int score = 1;
			do {
				if(Character.compare(ch[k], 'O') == 0) {
					lineScore += score;
					score++;
				} else if(Character.compare(ch[k], 'X') == 0) {
					score = 1;
				}
				k++;
			} while(k < lastIndex);
			
			bw.write(lineScore + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}