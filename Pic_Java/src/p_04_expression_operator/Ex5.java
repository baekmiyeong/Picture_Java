package p_04_expression_operator;

import java.io.*;

//키보드로 다섯 과목의 시험 점수를 입력받은 후, 다음과 같이 합계와 평균을 출력하시오.
public class Ex5 {

	public static void main(String[] args) throws IOException {
		System.out.println("과목 1~5의 점수를 정수로 입력하십시오.");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		sum += Integer.parseInt(str4);
		sum += Integer.parseInt(str5);
		
		//double avg = sum / (double)5;     //평균
		
		System.out.println("5과목의 합계는 " + sum + "점입니다.");
		System.out.println("5과목의 합계는 " + (sum / (double)5) + "점입니다.");
		                                    //평균을 저장한 avg
	}

}
