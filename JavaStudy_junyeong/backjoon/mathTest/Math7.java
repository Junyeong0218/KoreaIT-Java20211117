package mathTest;

import java.io.*;

public class Math7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int five;
		int sum = 0;
		
		while(true) {
			if(n%5 == 0) {
				five = n/5;
				break;
			}
			n -= 3;
			sum++;
		}
		
		if(n<0) {
			sum = -1;
		} else {
			sum += five;
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}
}
