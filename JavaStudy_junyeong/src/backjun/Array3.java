package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] in = new int[10];
		
		for(int i=0; i<in.length; i++) {
			in[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		int dif = 0;
		
		// 0~41 중에 같은게 몇개 있는지
		for(int i=0; i<42; i++) {
			int cnt = 0;
			for(int j=0; j<10; j++) {
				if(in[j] == i) {
					cnt++;
				}
			}
			if(cnt > 0) {
				dif++;
			}
		}
		
		System.out.println(dif);
	}
}