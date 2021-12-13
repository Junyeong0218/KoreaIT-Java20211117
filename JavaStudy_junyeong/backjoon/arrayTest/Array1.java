package arrayTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = Integer.parseInt(br.readLine());
		int[] array = new int[i];
		int min = 0;
		int max = 0;
		
		String data = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(data);
		
		for(int j=0; j<i; j++) {
			array[j] = Integer.parseInt(st.nextToken());
		}
		// 생성할때는 foreach 안됨.
		
		for(int ar : array) {
			if(ar == array[0]) {
				min = array[0];
				max = array[0];
				continue;
			}
			
			if(ar > max) {
				max = ar;
			}
			
			if(ar < min) {
				min = ar;
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}
