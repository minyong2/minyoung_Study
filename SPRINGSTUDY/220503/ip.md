```java
public 리턴타입 className (HttpServletRequest request){
		String ip = request.getHeader("x-forwarded-For");
		if (ip == null) ip = request.getRemoteAddr(); //클라이언트의 아이피 수집 가능
		System.out.println("ip=====>"+ip);
		return service.getUserList();
	}

    //ip=====>192.168.0.28
```