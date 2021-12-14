package mathTest;

import java.io.*;
import java.math.*;
import java.util.StringTokenizer;

public class Math8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		BigInteger sum = BigInteger.ZERO;
		sum = sum.add(new BigInteger(st.nextToken()));
		sum = sum.add(new BigInteger(st.nextToken()));
		
		bw.write(sum.toString());
		bw.flush();
		bw.close();
	}
}
