package p_06_multiple_iterations;

import java.io.*;

//키보드 시험 점수를 입력받아 합계를 출력하는 코드를 작성하시오.
//0을 입력받으면 결과를 출력하도록 합니다.(☆☆)
public class Ex2 {

	public static void main(String[] args) throws IOException {
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		int sum = 0;
		
		do {
			String str = br.readLine();		//키보드로 입력받는 문장!!(☆)
			num = Integer.parseInt(str);
			sum += num;
		} while(num != 0);	//0이 아닌 동안 반복됨	//거짓(num == 0)이 되면 탈출!!(☆)
		System.out.println("시험 점수의 합계는 " + sum + "점 입니다.");
	}

}
