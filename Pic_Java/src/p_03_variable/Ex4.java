package p_03_variable;

import java.io.*;

//화면에 출력하는 코드 작성
//원주율의 값은 얼마입니까? 3.14 -> 원주율의 값은 3.14입니다.
public class Ex4 {

	public static void main(String[] args) throws IOException {
		System.out.println("원주율의 값은 얼마입니까?");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));		
		String str = br.readLine();		
		double pi = Double.parseDouble(str);
		
		System.out.println("원주율의 값은 " + pi + "입니다.");
	}

}