package shopping;

class Members{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Avengers {

	public static void printMemberName(Members member) {
		//try-catch는 오류를 빨리 잡을 수 있지만 중괄호가 너무 많아져서 복잡해짐.
		//그래서 세밀한 작업을 하는 것에만 사용함. ; 실무에서 잘 안씀
		try {
			
			if(member == null) {
				member = new Members();
				member.getName();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법1
		Members member = new Members();
		Members member2 = new Members();
//		Members member2 = member; 이렇게 하면
//		member랑 member2랑 같은것임.		
		//위 두개는 다른거임!!
		member.setName("망나뇽");
		String name = member.getName();
		System.out.println("1 = > "+name);
		String name2 = member2.getName();
		System.out.println("2 = > "+name2);
		//모든 class의 초기값은 null이기에 null이 출력됨.
		
		
		printMemberName(member);
		
		//방법2
		printMemberName(new Members());
		
		Members m3 = null;
		printMemberName(m3);
		
		

	}

}
