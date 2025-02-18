package com.multi.d_api.anno;

//파일 다운 받을 때 미리 컴파일이 되어있는  경우가 있어서 제대로 동작하지않을 수 있음 그럴 때는 ctrl+shift+r replace  all시켜준다

public class Service {

	@PrintAnnotation_s(value = "*", number = 10)
	public void printStar() {
		System.out.println("*****");
	}

}
