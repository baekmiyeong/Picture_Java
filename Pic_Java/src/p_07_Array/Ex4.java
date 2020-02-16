package p_07_Array;

import java.io.*;

//키보드로 시험 점수를 입력받아 합계와 평균을 출력되게 코드를 작성하시오.
//5명의 시험 점수를 입력하십시오.
//80 60 57 50 22 엔터
//1번째 사람의 점수는 80입니다.
//		:
//가장 높은 점수는 80점입니다.
public class Ex4 {	//문제가 좀 이상함. 

	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int [] test = new int [5];
		System.out.println(test.length + "명의 시험 점수를 입력하십시오.");
		
		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s=0; s<test.length; s++) {
			for(int t=s+1; t<test.length; t++) {
				if(test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int j=0; j<test.length; j++) {
			System.out.println((j+1) + "번째 사람의 점수는 " + test[j] + "입니다.");
		}
		System.out.println("가장 높은 점수는 " + test[0] + "점입니다.");
	}

}
