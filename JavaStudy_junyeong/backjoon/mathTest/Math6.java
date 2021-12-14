package mathTest;

import java.io.*;

public class Math6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			int[][] arr = new int[k][n];
			
			for(int j=0; j<k; j++) {
				for(int l=0; l<n; l++) {
					if(j == 0 || l == 0) {
						arr[j][l] = l + 1;
					} else {
						arr[j][l] = arr[j-1][l] + arr[j][l-1];
					}
					if(j == k-1) {
						sum += arr[j][l];
					}
				}
			}
			bw.write(Integer.toString(sum) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
