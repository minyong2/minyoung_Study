package ex;

public class 알고리즘문제 {

	public static String solution(String[] seoul) {
		int len = seoul.length;
		int lan = 0;
		int result = 0;
		String search = "Kim";

		if (len >= 1 && len <= 1000) { //배열의 길이 제한
			for (int i = 0; i < len; i++) {
				if (seoul[i].length() >= 1 && seoul[i].length() <= 20) { 
					if (seoul[i].equals(search)) {
						result = i;
						break;
					}
				}
			}
		}

		String answer = "김서방은 "+result+"에 있습니다.";
		
		return answer;
	}
	public static void main(String[] args) {
		String seoul[] = { "Jane","Tod", "Kim" ,"Roman" };
		String result = solution(seoul);
		System.out.println(result);
	}
}
