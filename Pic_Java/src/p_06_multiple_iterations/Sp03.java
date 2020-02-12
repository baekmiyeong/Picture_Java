package p_06_multiple_iterations;

import java.io.*;

public class Sp03 {
//입력한 수만큼 별을 출력하기
	public static void main(String[] args) throws IOException {
		System.out.println("몇 개의 *을 출력 하시겠습니까?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();			//숫자를 입력
		int num = Integer.parseInt(str);
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");			//입력한 수만큼 *을 출력
		}
	}

}
