package mathTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.*;

public class Math10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			int distance = y-x;
			cnt = xtoy(distance);
			
			bw.write(Integer.toString(cnt) + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static int xtoy(int distance) {
		int move = 1;
		int cnt = 0;
		while(true) {
			distance -= move*2;
			if(distance < 0) {
				break;
			}
			move++;
			cnt += 2;
		}
		cnt -= distance/move;
		
		return cnt;
	}
}
