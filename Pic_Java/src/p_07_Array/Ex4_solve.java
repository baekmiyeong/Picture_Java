package p_07_Array;

import java.io.*;

//키보드로 시험 점수를 입력받아 합계와 평균을 출력되게 코드를 작성하시오.
//5명의 시험 점수를 입력하십시오.
//80 60 57 50 22 엔터
//1번째 사람의 점수는 80입니다.
//		:
//가장 높은 점수는 80점입니다.
public class Ex4_solve {

	public static void main(String[] args) throws IOException {
		System.out.println("5명의 시험 점수를 입력하십시오.");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));	
		int [] test = new int [5];
		
		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		int max = 0;
		
		for(int i=0; i<test.length; i++) {
			if(max < test[i]) {
				max = test[i];
			}
		}
		
		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "번째 사람의 점수는 " + test[i] + "입니다.");
		}
		System.out.println("가장 높은 점수는 " + max + "점입니다.");
	}

}
