package mathTest;

import java.io.*;
import java.math.*;
import java.util.StringTokenizer;

public class Math9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			if(y-x < 2) {
				cnt = 1;
			} else if(y-x == 2) {
				cnt = 2;
			} else {
				int distance = y-x; // 최소 3
				int[] moved = new int[distance];
				int moving = 1;
				
				for(int j=0; j<moved.length; j++) {
					if(j == 0) {
						moved[0] = moving;
						moved[moved.length-1] = moving;
					}
					
					// 남은거리 조사
					distance = 0;
					for(int k=j; k<moved.length; k++) {
						if(moved[k] == 0) {
							distance++;
						}
					}
					// 둘 다 더한 값으로 이동가능한지 조사
					if((moving+1)*2 < distance+1) {
						moving++;
						for(int k=0; k<moving; k++) {
							moved[j+1+k] = moving;
							moved[moved.length-1-(j+k+1)] = moving;
						}
						// 둘 중 하나의 값만 ++한 채로 이동 가능한지 조사
					} else if(moving*2 +1 < distance+1) {
						moved[j+1] = moving+1;
						moved[moved.length-1-(j+1)] = moving;
						break;
						// 둘 다 ++ 않은 값만큼 이동 가능한지 조사
					} else if(moving*2 < distance+1) {
						if(distance == 2) {
							moved[j+1] = moving;
							moved[moved.length-1-(j+1)] = moving;
							break;
						} else {
							moved[j+1] = moving+1;
							break;
						}
						// ++하지 않은 하나의 값만큼 이동 가능한지 조사
					} else if(moving < distance+1){
						moved[j+1] = moving;
						break;
					}
				}

				for(int j : moved) {
					System.out.print(j + " ");
				}
				System.out.println();
				// 1 2 2 2 2 1
				int j=0;
				while(j<moved.length) {
					cnt++;
					j += moved[j];
				}
			}
			bw.write(Integer.toString(cnt) + "\n");
		}
		
		
		bw.flush();
		bw.close();
	}
}
