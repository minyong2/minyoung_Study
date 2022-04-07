package 컬렉션즈;
//내가 푼거 =_=

import java.util.ArrayList;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist는 무한으로 배열 추가 가능(크기가 무한정)
		//<> 제네릭을 통해서 타입을 정해주는 것
		//EmpVO e = new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20);
		//아랫줄이랑 같음!
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));
		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));
		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));
		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));
		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));
		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));
		
		int count = 0;
		int count_20 = 0;
		int count_30 = 0;
		int temp = list.get(0).sal;
		String name = "";
		int empno2 = 0;
		String date = "";
		String job = "";
		
		System.out.println("== 1번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			int empno = list.get(i).empno;
			String ename = list.get(i).ename;
//			System.out.println("==1번 문제==");
			System.out.println("사원번호 >"+empno);
			System.out.println("사원이름 >"+ename);
			System.out.println();
		}
		System.out.println("== 2번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).sal > 1300) {
				//급여가  1300 이상만 출력
				System.out.print("사원이름 >"+list.get(i).ename+" ");
				System.out.println("사원직업 >"+list.get(i).job);	
			}
		}
		System.out.println("== 3번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).job.equals("SALESMAN")) {
				//직업이 salesman인 사원 중 급여가 1400 이상의 사원 번호,이름
				if(list.get(i).sal > 1400) {
					System.out.println("사원이름 >"+list.get(i).ename);
					System.out.println("사원번호 >"+list.get(i).empno);
				}
			}
		}
		System.out.println("== 4번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			String hire = list.get(i).hiredate;
			String[] split = hire.split("-");
			String year = split[0];
//			System.out.println(year);
			if(year.equals("1981")) {
				System.out.println(list.get(i).ename);
				System.out.println(list.get(i).empno);
			}
		}
		System.out.println("== 5번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).job.equals("MANAGER")) {
				//직업이 매니저
				count++;
				System.out.println("직업이 매니저인 사람은"+count+"명 입니다.");
			}
		}
		for(int i=0; i<list.size(); i++) {
			//int temp = list.get(0).sal;
			if(list.get(i).sal > temp) {
				//6. 사원 중 급여를 가장 많이 받는 사원의 번호 이름 입사년도 조회
				temp = list.get(i).sal;
				name = list.get(i).ename;
				empno2 = list.get(i).empno;
				date = list.get(i).hiredate;
				

			}
		}
		System.out.println("== 6번 문제 ==");
			System.out.println(name);
			System.out.println(empno2);
			System.out.println(date);
		////7. 부서번호별 수 조회 ex) 20 : 2명, 30: 3명
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).deptno == 30) {
				count_30++;
			}
			if(list.get(i).deptno == 20) {
				count_20++;
			}
		}
		
		System.out.println("==7번 문제 ==");
		System.out.println("30 :"+count_30);
		System.out.println("20 :"+count_20);
		
		//8. 입사월이 02월인 사원 수 조회
		System.out.println("==8번 문제 ==");
		int count_02 = 0;
		for(int i=0; i<list.size(); i++) {
			String hire = list.get(i).hiredate;
			String[] split = hire.split("-");
			String mon = split[1];
//			System.out.println(year);
			if(mon.equals("02")) {
				count_02++;
			}
			
		}
		System.out.println("02월 입사자는 "+count_02+"명 입니다.");
		
		System.out.println("==2-1번 문제 ==");
		int sum = 0;
		int avg = 0;
		int comm_count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).comm > 0) {
			name = list.get(i).ename;
			job = list.get(i).job;
			comm_count++;
				
			System.out.println("comm을 받은 사원의 이름 : "+name);
			System.out.println("comm을 받은 사원의 직업 : "+job);
			}
		
		}
		System.out.println("comm을 받은 사원의 수 : "+comm_count);
		
		System.out.println("==2-2번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i).sal;
			avg = sum/list.size();
		}
		System.out.println("emp의 급여 평균은 "+avg);
		System.out.println("==2-3번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).empno == 7844 ||list.get(i).empno == 7876 ) {
				list.get(i).comm += 200;
				System.out.println(list.get(i).comm);
			}
		}
		System.out.println("==2-4번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).ename == null) {
				list.get(i).ename = "데이터없음";
				System.out.println(list.get(i).ename);
				
				
			}
		}
		System.out.println("==2-5번 문제 ==");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).deptno == 20) {
				list.remove(i);
				System.out.println(list.get(i).deptno);
			}
		}
		

	}

}
