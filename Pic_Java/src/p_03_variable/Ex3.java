package p_03_variable;

import java.io.*;

//화면에 출력하는 코드 작성
//당신은 몇 살입니까? 23 -> 당신은 23살입니다.
public class Ex3 {

	public static void main(String[] args) throws IOException {
		System.out.println("당신은 몇 살 입니까?");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));		
		String str = br.readLine();		
		int age = Integer.parseInt(str);
		
		System.out.println("당신은 " + age + "살입니다.");
	}

}