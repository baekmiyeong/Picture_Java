//////////////////////////////////////////////////////////
package p_04_expression_operator;

import java.io.*;

public class Sp06 {
//복합 대입 연산자
	public static void main(String[] args) throws IOException {
		System.out.println("정수를 3개 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 0;		//초기화
		
		//sum = sum + 값(키보드로 입력된 문자의 정수형)
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		//sum = sum + Integer.parseInt(str3) 와 동일!		
		
		System.out.println("3개 정수의 합은 " + sum + "입니다.");
	}

}