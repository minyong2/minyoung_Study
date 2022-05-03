package com.example.first_spring.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring.vo.UserVO;
//@Controller : url을 요청받는 곳이랍니다~
@RestController
public class MainController {
	
	@GetMapping("/index")
	public String call() { // index라는 주소를 요청하면 call() 메소드를 실행할게~
		String word = "Hello World 민영2";
		return word;
	}
	
	@GetMapping("/sum")
	public int callSum() {
		int x = 10;
		int y = 200;
		
		return x + y ;
	}
	
	@GetMapping("/arr")
	public int[] callArray() {
		int arr[] = {1,3,5};
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]*2;
		}
		return arr;
	}
	
	@GetMapping("/info")
	public UserVO callMyInfo() {
		UserVO vo = new UserVO(null, 0);
		vo.setAge(24);
		vo.setName("김민영");
		return vo;
	}
	
	@GetMapping("/user")
	public UserVO callUser() {
		UserVO vo = new UserVO("dd",30);
		return vo;
	}
	
	@GetMapping("/userlist")
	public List<UserVO> callUserList() {
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("홍길동",30));
		list.add(new UserVO("홍길은",30));
		list.add(new UserVO("홍길금",30));
		list.add(new UserVO("홍길옥",30));
		list.add(new UserVO("홍길쇠",30));
		list.add(new UserVO());
		return list;
		
	}
	
	public List<UserVO> callInfo(){
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("d",1));
		return null;
	}
	
	
	

}
