package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 0;
		int max = Integer.parseInt(br.readLine());
		
		while(n < max) {
			
			String in = br.readLine();
			StringTokenizer st = new StringTokenizer(in);
			
			double[] score = new double[Integer.parseInt(st.nextToken())];
			double sum = 0;
			
			for(int i=0; i<score.length; i++) {
				score[i] = Double.parseDouble(st.nextToken());
				sum += score[i];
			}
			
			double average = sum / score.length;
			int count = 0;
			
			for(double s : score) {
				if(s > average) {
					count++;
				}
			}
			int per = (int)((count / score.length) * 100);
			
			
			bw.write(per);
			
			
			n++;
		}
	}
}
