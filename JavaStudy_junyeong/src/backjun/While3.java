package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class While3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		int n = 0;
		int a = num + 1;
		int b = num + 1;
		int temp = num;
		
		while(Integer.parseInt(Integer.toString(a) + Integer.toString(b)) != num) {
			if(n == 0) {
				if(temp < 10) {
					a = 0;
					b = temp;
				} else {
					a = temp / 10;
					b = temp % 10;
				}
			}
			
			temp = a + b;
			
			a = b;
			b = temp % 10;
			
			n++;
		}
		
		bw.write(Integer.toString(n));
		bw.flush();
		bw.close();
		
	}
}
