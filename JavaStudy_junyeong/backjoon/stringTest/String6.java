package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		StringTokenizer st = new StringTokenizer(sb.toString());
		char[] a = st.nextToken().toCharArray();
		char[] b = st.nextToken().toCharArray();
		
		char temp;
		temp = a[2]; a[2] = a[0]; a[0] = temp;
		temp = b[2]; b[2] = b[0]; b[0] = temp;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) {
				continue;
			} else if(a[i] > b[i]) {
				bw.write(a);
				break;
			} else {
				bw.write(b);
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}