package backjun;

import java.io.*;

public class Math3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		// n=2 -> max=3
		int sum= 1;
		while(n > max || max == 0) {
			max += sum;
			sum++;
		}
		
		boolean isUp = false;
		if(max%2 == 1) {
			
		}
		
		
		System.out.println(max + " " + sum);
	}
}
