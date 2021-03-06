package test;

import java.util.ArrayList;
import java.util.List;

class MemberVO{
	private String memberNo;
	private int sal;
	public String getMemberNo() {
		return memberNo;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	
}
class MemberCode{
	public static final double BONUS = 0.1;
	public static final int MAX_VALUE = 300;
	

}

class MemberService implements MemberServiceImpl {
	@Override
	public String getMemberNo(List<MemberVO> list) {
		// TODO Auto-generated method stub
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSal() >= MemberCode.MAX_VALUE) {
				System.out.println("*연 봉 300 이상 * \n NO : "+list.get(i).getMemberNo());
				
				return list.get(i).getMemberNo();
			}
		}
		
		return null;
	}

	@Override
	public List<MemberVO> getmemberList(List<MemberVO> list) {
		// TODO Auto-generated method stub
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getMemberNo().equals("200")) {
				int sal = list.get(i).getSal();
				sal = (int) (sal+(sal*MemberCode.BONUS));
			//  └ static은 new없이도 접근 가능해서 BONUS를 불러올 수 있음!
				list.get(i).setSal(sal);
				System.out.println("*뽀 나 스 받으면 * \n"+sal);
			}
			
		}
		return list;
	}
}
public class 긴급점검5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO mem100 = new MemberVO();
		mem100.setMemberNo("100");
		mem100.setSal(100);
		
		MemberVO mem200 = new MemberVO();
		mem200.setMemberNo("200");
		mem200.setSal(200);
		
		MemberVO mem300 = new MemberVO();
		mem300.setMemberNo("300");
		mem300.setSal(300);
		
		list.add(mem100);
		list.add(mem200);
		list.add(mem300);
		
		 
		// ------보너스 로직-------
		
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getMemberNo().equals("200")) {
//				int sal = list.get(i).getSal();
//				sal = (int) (sal+(sal*MemberCode.BONUS));
//				list.get(i).setSal(sal);			
//			}
//		}
		
		MemberService s = new MemberService();	
		list = s.getmemberList(list);
		
		
		// -------호출 로직--------
		System.out.println("* 멤 바 호 출 *");
		for(MemberVO vo : list) {
			System.out.println(vo.getMemberNo()+","+vo.getSal());
			
		}
		
		s.getMemberNo(list);
		

	}

}
