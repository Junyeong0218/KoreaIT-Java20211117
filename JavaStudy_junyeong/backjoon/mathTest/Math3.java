package mathTest;

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
		
		int up, down;
		boolean isUp = false;
		
		if((sum-1)%2 == 1) {
			// 홀수 = 아래로 -> 분자 = 1 분모 = max-1
			up = 1;
			down = sum-1;
		} else {
			up = sum-1;
			down = 1;
			isUp = true;
		}
		
		for(int i=0; i<max-n; i++) {
			if(isUp) {
				up--;
				down++;
			} else {
				up++;
				down--;
			}
		}
		
		bw.write(Integer.toString(up) + "/" + Integer.toString(down));
		bw.flush();
		bw.close();
	}
}
