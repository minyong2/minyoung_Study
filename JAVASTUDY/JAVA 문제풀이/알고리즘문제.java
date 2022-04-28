//알고리즘 문제 풀이
//seoul은 길이 1 이상, 1000 이하인 배열입니다.
//seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
//숫자에서 문자 변환 메소드는 Integer.toString()를 사용합니다.
//문자와 문자를 비교할 때는 equals()를 사용합니다.

//String형 배열 seoul의 element중 
//"Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 
//String을 반환하는 함수, solution을 완성하세요. 
//seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 
//값이 입력되는 경우는 없습니다.

package ex;

public class 알고리즘문제 {

	public static String solution(String[] seoul) {
		int len = seoul.length;
		int lan = 0;
		String answer = "";
		int result = 0;
		String search = "Kim";

		if (len >= 1 && len <= 1000) { //배열의 길이 제한
			for (int i = 0; i < len; i++) {
				if (seoul.length >= 1 && seoul.length <= 20) { 
					//인덱스 문자열의 길이 제한
					if (seoul[i].equals(search)) {
						result = i;
					}
				}
			}
		}
		String c = Integer.toString(result);

		answer = "김서방은 " + c + "에 있음";
		return answer;
	}
	public static void main(String[] args) {
		String seoul[] = { "Jane", "Kim" };
		String result = solution(seoul);
		System.out.println(result);
	}
}
