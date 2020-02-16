package p_07_Array;

public class Sp11 {
//길이가 일정하지 않은 다차원 배열
	public static void main(String[] args) {
		int [][] test = {
				{80,60,22,50},{90,55,68,72},{33,75,63}
		};
			//배열 전체의 길이를 표시
		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "번째 배열 요소의 길이는 " + test[i].length + "입니다.");
									//배열 변수 test 각각의 길이를 표시
		}
	}

}
