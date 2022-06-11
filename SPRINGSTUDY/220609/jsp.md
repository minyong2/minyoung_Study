```
세션이란?
=> 서버가 다운되거나 혹은 만료시간이 지나기 전까지 데이터를 보관하는 기술
데이터베이스에 저장하는게 아닌
웹 서버에 임시적으로 저장하는 것.

대표적인 세션 : 회원 정보(PK,이름 ... 간단한 것)

서버가 꺼지거나 지정해둔 시간이 지나기 전까지.
```
```java

@GetMapping("/board")
	public String loadBoardPage(ModelMap map, HttpSession httpSession) {
		
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("Company", "Alfreds Futterkiste");
		map1.put("Contact", "Maria Anders");
		map1.put("Country", "Germany");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("Company", "Centro comercial Moctezuma");
		map2.put("Contact", "Francisco Chang");
		map2.put("Country", "Mexico");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("Company", "Ernst Handel");
		map3.put("Contact", "Roland Mendel");
		map3.put("Country", "Austria");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
	
		data.put("list", list);
		map.addAttribute("data", data);
		
		//세션데이터 가져오기
		String userId = (String)httpSession.getAttribute("userId");
		String userPassword = (String)httpSession.getAttribute("userPassword");
		System.out.println("세션에서 가져온 데이터 ==> "+userId);
		System.out.println("세션에서 가져온 데이터 ==> "+userPassword);
		
		//redirect : 재요청
		if(userId == null) {
			return "redirect:/login";
		}
		
		return "board";
	}

    @GetMapping("/")
	public String loadMainPage() {
		return "home";
	}

    @GetMapping("/logout")
	public String goLoginPage(HttpSession httpSession) {
		//세션을 지우고 로그인 창으로 가라
		httpSession.removeAttribute("userId");
		httpSession.removeAttribute("userPassword");
		return "login";
	}

    @PostMapping("login")
	public @ResponseBody boolean callLogin(@RequestBody Map<String,Object> data, HttpSession httpSession) {
		String userId = (String) data.get("userId");
		String userPassword = (String) data.get("userPassword");
		
		System.out.println(userId);
		System.out.println(userPassword);
		
		//세션에 데이터 set
		httpSession.setAttribute("userId", userId);
		httpSession.setAttribute("userPassword", userPassword);
		return true;
	}

    @GetMapping("/logout")
	public String goLoginPage(HttpSession httpSession) {
		//세션을 지우고 로그인 창으로 가라
		httpSession.removeAttribute("userId");
		httpSession.removeAttribute("userPassword");
        //세션에 있는 데이터를 지우는거임!
		return "login";
	}
	
```
```
로그인 안하고 board 사이트로 들어갈 경우 -> 로그인창으로 이동
로그인창에서 로그아웃하고 보드로 들어갈경우 -> 로그인창으로 이동


```
---
```
@ResponseBody : return을 json으로

@Controller을 하면
return은 페이지 이름으로 해야함

페이지 이름이 아니라 json으로 결과를 받고 싶을 때 
@ResponseBody를 사용하면 된다.
단, 컨트롤러가 @RestController가 아닐시에만.


```