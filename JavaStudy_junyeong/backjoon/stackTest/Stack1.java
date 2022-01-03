package stackTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Stack1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken());
			
			switch(sb.toString()) {
			case "push" :
				list.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				if(list.size() == 0) {
					bw.append("-1" + "\n");
				} else {
					bw.append(Integer.toString(list.remove(list.size()-1)) + "\n");
				}
				break;
			case "size" :
				bw.append(Integer.toString(list.size()) + "\n");
				break;
			case "empty" :
				if(list.size() == 0) {
					bw.append('1' + "\n");
				} else {
					bw.append('0' + "\n");
				}
				break;
			case "top" :
				if(list.size() == 0) {
					bw.append("-1" + "\n");
				} else {
					bw.append(Integer.toString(list.get(list.size()-1)) + "\n");
				}
				break;
			}
			
			sb.delete(0, sb.length());
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
