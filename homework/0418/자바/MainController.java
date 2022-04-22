package user;

import java.util.ArrayList;
import java.util.List;

/**
 * @author minyoung Kim
 * @Date 2022. 4. 20.
 * comment : 메인 로직 클래스
 */
public class MainController{
    public static void main(String args[]){
        
        List<UserVO> list = new ArrayList<UserVO>();
        list.add(new UserVO("Alex","DEVELOP",200));
        list.add(new UserVO("Max","DEVELOP",80));
        list.add(new UserVO("Brian","DEVELOP",100));
        list.add(new UserVO("mr.Hyun","MANAGER",300));
        list.add(new UserVO("Allen","DEVELOP",110));
        list.add(new UserVO("Katter","DEVELOP",220));
        list.add(new UserVO("Hooker","MANAGER",1500));
        list.add(new UserVO("King","MASTER",0));
        
        
        
        //여기서 문제 풀 것
        UserService service = new UserService();
        service.updateSal(list, "DEVELOP");
//      service = new UserService2(); 가능
        //부모는 자식을 포함시킬 수 있지만 , 자식은 부모를 포함시킬 수 없다.
        
        System.out.println("***1번***");
        int sal = 0;
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i).getDname().equals("DEVELOP")) {
        		sal = list.get(i).getSal()*2;
        		list.get(i).setSal(sal);
        	}
        	System.out.println(list.get(i).getSal());
        	
        }
        System.out.println("***2번***");

        int lv=0;
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i).getSal()>=0 && list.get(i).getSal()<101) {
        		list.get(i).setLv(1);
        	}
        	if(list.get(i).getSal()>101 && list.get(i).getSal()<1000) {
        		list.get(i).setLv(2);
        	}
        	if(list.get(i).getSal()>1001) {
        		list.get(i).setLv(3);
        	}
        	lv = list.get(i).getLv();
        	System.out.println(lv);
        }
        
        System.out.println("***3번***");
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i).getLv() >= 3) {
        		list.remove(i);
        	}
        	System.out.println(list.get(i).getEname());
        }
        System.out.println("***4번***");
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i).getEname().equals("King")) {
        		
        		
        		System.out.println("사원 이름 "+list.get(i).getEname());
        		System.out.println("부서 이름 "+list.get(i).getDname());
        		System.out.println("사원 연봉 "+list.get(i).getSal());
        		System.out.println("사원 레벨 "+list.get(i).getLv());
        	}
        }
        System.out.println("---");

    }
}