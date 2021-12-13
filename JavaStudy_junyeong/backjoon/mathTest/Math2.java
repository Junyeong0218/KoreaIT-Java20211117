package mathTest;

import java.io.*;

public class Math2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int max = 1;
		int cnt = 1;
		
		while(max < n) {
			max += cnt * 6;
			cnt++;
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}