package 클래스;

public class 중급 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("☆★1번 문제★☆");
		  String phone = "017-404-1234";
		  String array[] = phone.split("-");
	        //... 코드 작성 ...
		  if(array[0] != "010") {
			  System.out.println("핸드폰 번호를 변경해야 합니다.");
		  }
		  String mid = array[1].replace("404", "xxx");
		  array[1] = mid;
		  String last = array[2].replace("1234", "xxxx");
		  array[2] = last;
		  
			for(String str : array){
				System.out.print(str);
			}
System.out.println();			
			
//===========================================================
//			점수중에 100점이 있다면 "100점 만점에 100점!" 출력.
//			평균 소수점 무시. (int형으로 받을 것)
			/*
			 * 100점 만점에 100점! 
			 * 281 
			 * 70
			 */
			System.out.println("☆★2번 문제★☆");
			 String scores = "80,70,100,31";
		        int len = 0; //과목 수
		        int avg = 0;
		        int x =0;
		        int sum=0;
		        String array2[] = scores.split(",");
		        
		        for(int i=0; i<array2.length; i++) {
		         x = Integer.parseInt(array2[i]);
		         sum += x;
		         len = array2.length;
		         avg = sum/len;
		         
		        if(x==100) {
		        	System.out.println("100점 만점에 100점!");
		        }	 }		        
		        System.out.println("총점 : "+sum);
		        System.out.print("평균 : "+avg);
		        System.out.println();
//===========================================================
		        
		        System.out.println("☆★3번 문제★☆");
		        String query = "name=brian&addr=daejeon&age=30";
		        String name = "";
		        String addr = "";
		        int age = 0;
		        String arr[] = query.split("&"); //0,1,2 3개 배열
		        String na1[] = arr[0].split("=");//na1[0]=name,na1[1]=brian
		        String na2[] = arr[1].split("=");//na2[0]=addr,na2[1]=daejeon
		        String na3[] = arr[2].split("=");//na3[0]=age, na3[1]=30
		        
		        age = Integer.parseInt(na3[1]);
		        name = na1[1];
		        addr = na2[1];
		        
		        System.out.println("name : "+name);
		        System.out.println("addr : "+addr);
		        System.out.print("age : "+age);
	}
}