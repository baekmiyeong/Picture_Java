package p_06_multiple_iterations;

public class Sp07 {
//for 문 중첩하기
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {                             		//for(식1-1; 식2-1; 식3-1)
			System.out.println("바깥 for문 출력 " + i);          //		문장1;
			for(int j=0; j<3; j++) {                         	//	for(식2-1; 식2-2; 식3-2)
				System.out.println("i는 " + i + ": j는 " + j); //		  문장2;
			}                                                	//안의 for문이 식2-2만큼 돌면서 문장2를 수행한 후,
		}                                                    		//바깥의 for문으로 나가 식2-1만큼 돌면서 문장1을 수행반복														
	}								

}
