package 클래스;

public class 난이도중급 {
	//array[]배열에서 가장 큰 수를 리턴
	//리턴 받은 값을 리턴타입이 boolean인 isNum함수 파라미터에 넣는다
	//start는 0보다 클 수 없습니다.
	//end는 배열길이와 같아야 합니다.
	//max에 10보다 큰 수가 오면 0을 해야 합니다.
	
	public static boolean isNum(int max){
        int standardVal = 10; //int로 바꿈
        if(max < standardVal){
            return true;
        }
        return false;
    }

	 public static int getSum(int start, int end){
	        int array[] = {3,8,9};
	        end = array.length;
	        //int x[] = new int [len];
	        int max = 0;
	        for(int i=start; i<end; i++){
	            //로직 구현
	        	if(start == 0) {
	        	if(max>array[i]) {
	        		max=array[i];
	        		}
	        	if(max > 10) {
	        		return 0;
	        		}
	        }}
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int start = 0;
	        int end = 0;
	        int max = getSum(start, end);
	        boolean isFlag = isNum(max);
	        System.out.print(isFlag);

	}

}
#########################################################2번
package 클래스;

public class 난이도중급2 {
	
	 public static int[] getResult(int[] array){
		 
		 int len = array.length;
		 for(int i=0; i<len; i++) {
			if(array[i]<300) {
				if((array[i]%2)==0) {
					array[i]=0;
				}
			}
		 }
	        return array;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int array[] = {120, 340, 200, 430, 33};
	        int result[] = getResult(array);
	        for(int i : result){
	            System.out.print(i+" ");

	

	        }
	}
}

#########################################################3번package 클래스;
public class 난이도중급3 {
//	배열 인덱스값에 기호가 들어간 문자는 제거한다.
//	배열 인덱스값을 문자에서 숫자로 변환한다.
//	인덱스값 중 1번째 인덱스값이 200이하면 100을 리턴. 
//	200 이상이면 200을 리턴 하시오.
//{"100","1!30","11$0","200"};
	 public static int getResult(String[] array){
		 for(int i=0; i<array.length; i++) {
			 String result = array[i].replace("!", "");
			 String temp = result.replace("$", "");
			
			 int x = Integer.parseInt(temp);
			 if(x <= 200) {
				 return 100;
			 }else
			 {
				 return 200;	 }
		 }
		 return 0;   }
	public static void main(String[] args) {
		 String array[] = {"100","1!30","11$0","200"};
	        int result = getResult(array);
	        System.out.println(result);
	}
}
#########################################################4번
package 클래스;
//해당 명부에는 1페이지에 10명만 작성할 수 있다.
//명부에 58명이 작성했다고 가정하면 총 몇 페이지 명부가 작성되었을까?
//명부는 100명 이하까지 작성 가능합니다.
//코드라인 10줄 이하로 작성하기.
public class 난이도중급4 {
	 public static int calcPage(int tc, int rows) {
		 int count = 0;
		 int j = tc/rows;
		 if(tc <=100) {
		 if(tc%rows != 0) {
			 count++;
			 return count + j;
		 	}
		 }
		 return 0;		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int tc = 58; //총 인원값
	        int rows = 10; //1페이지에 작성할 수 있는 기준값
	        int pages = calcPage(tc, rows);
	        System.out.println(pages+" 페이지");
	}
}