```
class MemberCode{
	public static final double BONUS = 0.1;
	public static final int MAX_VALUE = 300;
	

}

class MemberService{
	public List<MemberVO> getmemberList(List<MemberVO> list){
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
```