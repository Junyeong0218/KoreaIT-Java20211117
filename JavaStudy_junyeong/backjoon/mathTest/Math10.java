package mathTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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
		int cnt = 0;
		if(distance < 2) {
			cnt++;
			return cnt;
		} else if(distance == 2) {
			cnt += 2;
			return cnt;
		}
		
		int move = 1;
		while(true) {
			distance -= move*2;
			cnt += 2;
			
			if(distance < 0) {
				cnt -= 2;
				distance += move*2;
				move--;
				continue;
			} else if(distance == 0) {
				break;
			} else if(distance == (move+1)*2 || distance == move*2 +1){
				cnt += 2;
				break;
			} else if(distance == move*2 || distance == move) {
				cnt++;
				break;
			} else if(distance == move-1) {
				cnt++;
				break;
			}
			move++;
		}
		
		return cnt;
	}
}