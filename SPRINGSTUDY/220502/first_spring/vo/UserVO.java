package com.example.first_spring.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@getter,@setter or @data : getter setter함수를 자동으로 만들어 준다~!
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
	private String name;
	private int age;
//	private String addr;
//	public List<String> nameList;	
}

class UserInfo{
	private String addr;
	private int num;
}
