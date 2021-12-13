package stringTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class String1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		String in = br.readLine();
		
		br.close();
		
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(in.substring(i, i+1));
			sum += num[i];
		}
		
		bw.write(15);
		bw.flush();
		bw.close();
	}
}
