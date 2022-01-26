class Solution {
    public String solution(String num) {
        String answer = "";
        final int EXCEPTION_COUNT = 4;
		int l = num.length();
        
		String phone_fir_mid = num.substring(0,l-EXCEPTION_COUNT);
		String phone_last = num.substring(l-EXCEPTION_COUNT,l);
		String change_num = "";   
        
        change_num = phone_fir_mid.replaceAll(".","*");
		answer = change_num + phone_last;
		return answer;
	}
   }
