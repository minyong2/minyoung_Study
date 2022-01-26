package 프로그래머스;

//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 
//"Odd"를 반환하는 함수(메소드), 
//solution을 완성해주세요.
//1. 정수 num을 받는 파라미터가 있어야 함.
//2. return 타입은 String.
//3. 메소드 이름은 solution.
public class 짝수와홀수 {
	public static String solution(int num) {
		String answer = "";
		if((num%2) == 0) {
			answer = "Even";
		}if((num%2) != 0) {
			answer = "Odd";
		}
		
		return answer ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		String result = solution(num);
		System.out.println("num : " + num + " return : " +result);

	}

}
