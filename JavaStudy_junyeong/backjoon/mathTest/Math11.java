package mathTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Math11 {

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
		int i = 1;
		int max = distance;
		boolean isZero = false; 
		
		while(!isZero) {
			
			for(int j=i; j<max; j++) {
				distance -= j*2;
				cnt += 2;
				System.out.println("1. "+ j + " " + distance + " " + cnt);
				
				if(distance == 0) {
					isZero = true;
					break;
				} else if(distance < 0) {
					if(distance + j == 0) {
						cnt--;
						distance += j;
						System.out.println("123");
						isZero = true;
						break;
					} else {
						i = j-1;
						distance += j*2;
						cnt -= 2;
						System.out.println("2. " + i + " " + distance + " " + cnt);
						if(distance - i == 0) {
							distance -= i;
							cnt++;
							isZero = true;
							break;
						} /*else if(distance - (i*2) -1 == 0) {
							cnt++;
							isZero = true;
							break;
						}*/
					}
				}
			}
		}
		
		
		return cnt;
	}
}