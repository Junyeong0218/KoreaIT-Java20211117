package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		double[] test = new double[n];
		double max = 0;
		
		String score = br.readLine();
		StringTokenizer st = new StringTokenizer(score);
		
		for(int i=0; i<test.length; i++) {
			test[i] = Double.parseDouble(st.nextToken());
			if(test[i] > max) {
				max = test[i];
			}
		}
		
		for(int i=0; i<test.length; i++) {
			test[i] = (test[i]/max)*100;
		}
		
		double average = 0;

		for(double d : test) {
			average += d;
		}
		
		System.out.println(average / n);
		
	}
}
