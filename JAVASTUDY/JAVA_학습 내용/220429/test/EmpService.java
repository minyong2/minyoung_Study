package final_test;

import java.util.ArrayList;
import java.util.List;

public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		for(int i=0; i<list.size(); i++) {
			int sal = list.get(i).getSal();
			sal = sal+EmpCode.SPECIAL_BONUS;
			list.get(i).setSal(sal);
			System.out.println(list.get(i).getSal());
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		int top = list.get(0).getSal();
		String name = "";
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSal()>top) {
				top = list.get(i).getSal();
				name = list.get(i).getEname();
			}
		}
		System.out.println(name+" "+top+"Ώψ");	
		return null;
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSal() <= 300) {
				count ++;
			}
		}
		System.out.println(count+"Έν");
		return 0;
	}
	
	
	@Override
	public EmpVO setDept(EmpVO empVO) {
		DeptVO dept = new DeptVO(10, "SALES");
		List<DeptVO> list = new ArrayList<DeptVO>();
		list.add(dept);
		empVO.setList(list);
		return empVO;
	}

}