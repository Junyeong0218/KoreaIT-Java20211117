package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		int[] count = new int[10];
		int[] num;
		// 100¸¸ ~ 1¾ï
		if(n > 99_999_999) {
			num = new int[9];
			for(int i=0; i<9; i++) {
				num[i] = n % 10;
				n /= 10;
			}
		} else if(n > 9_999_999) {
			num = new int[8];
			for(int i=0; i<8; i++) {
				num[i] = n % 10;
				n /= 10;
			}
		} else {
			num = new int[7];
			for(int i=0; i<7; i++) {
				num[i] = n % 10;
				n /= 10;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(num[j] == i) {
					count[i]++;
				}
			}
		}
		
		for(int c : count) {
			System.out.println(c);
		}
	}
}
