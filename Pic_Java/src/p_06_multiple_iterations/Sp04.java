package p_06_multiple_iterations;

import java.io.*;

public class Sp04 {
//1부터 입력한 숫자까지의 합을 구하기
	public static void main(String[] args) throws IOException {
		System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();         //숫자를 입력
		int num = Integer.parseInt(str);
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;                       //i가 입력한 숫자와 같아질 때까지 연산
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
	}

}
