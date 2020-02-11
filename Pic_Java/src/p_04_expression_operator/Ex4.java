package p_04_expression_operator;

import java.io.*;

//키보드로 삼각형의 밑변과 높이를 정수로 입력받아 넓이를 구하시오
//삼각형의 밑변과 높이를 입력하십시오. 3 5 => 삼각형의 넓이는 7.5입니다.
//삼각형의 넓이 = (밑변 * 높이) / 2
public class Ex4 {

	public static void main(String[] args) throws IOException {
		System.out.println("삼각형의 밑변과 높이를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));	
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int width = Integer.parseInt(str1);
		int height = Integer.parseInt(str2);	
		double area = (width * height) / (double)2;    //넓이
		
		System.out.println("삼각형의 넓이는 " + area + "입니다.");
	}

}
