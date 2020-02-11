package p_03_variable;

import java.io.*;

//화면에 출력하는 코드 작성
//키와 몸무게를 입력하십시오. 165.2 52.5
//키는 165.2센티미터입니다.
//몸무게는 52.5킬로그램입니다.
public class Ex5 {

	public static void main(String[] args) throws IOException {
		System.out.println("키와 몸무게를 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));		
		String str1 = br.readLine();
		String str2 = br.readLine();		
		double height = Double.parseDouble(str1);
		double weight = Double.parseDouble(str2);
		
		System.out.println("키는 " + height + "센티미터입니다.");
		System.out.println("몸무게는 " + weight + "킬로그램입니다.");
	}
}