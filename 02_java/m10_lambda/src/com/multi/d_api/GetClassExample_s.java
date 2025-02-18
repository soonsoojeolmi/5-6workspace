package com.multi.d_api;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*리플렉션(Reflection)은 런타임에 클래스의 메타데이터(클래스, 필드, 메서드, 생성자 정보 등)에 접근하고 조작할 수 있는 기능이다.
자바의 java.lang.reflect 패키지를 사용하여 구현할 수 있다.

주요 기능
클래스 정보 조회 (Class<?> clazz = Class.forName("java.util.ArrayList");)
필드, 메서드, 생성자 정보 가져오기 (getDeclaredFields(), getDeclaredMethods())
필드 값 변경 (setAccessible(true), field.set())
동적으로 객체 생성 (clazz.newInstance(), constructor.newInstance())
장점
컴파일 시점이 아닌 실행 시점에 동적으로 클래스 정보를 분석 및 조작할 수 있다.
프레임워크(Spring, Hibernate 등)에서 동적으로 객체를 생성하거나 의존성을 주입하는 데 사용된다.
단점
성능 저하: 리플렉션은 직접적인 호출보다 느리다.*/

public class GetClassExample_s {
	public static void main(String[] args) throws Exception {
		// Reflection을 통해 ArrayList 클래스의 메타데이터에 접근하는 Class 객체 생성
		Class<?> clazz = Class.forName("java.util.ArrayList");

		// 클래스 기본 정보 출력
		System.out.println("패키지: " + clazz.getPackage().getName());         // 패키지 이름
		System.out.println("클래스 간단이름: " + clazz.getSimpleName());       // 클래스 간단한 이름
		System.out.println("클래스 전체이름: " + clazz.getName());             // 클래스 전체 이름

		// 생성자 정보 출력
		System.out.println("\n[생성자 정보]");
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class<?>[] parameters = constructor.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				System.out.print(parameters[i].getSimpleName()); // 생성자 매개변수 타입 출력
				if (i < parameters.length - 1) System.out.print(", ");
			}
			System.out.println(")");
		}

		// 필드 정보 출력
		System.out.println("\n[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("필드 이름: " + field.getName());               // 필드 이름 출력
			System.out.println("필드 타입: " + field.getType().getName());     // 필드 타입 출력
			System.out.println();
		}

		// 메서드 정보 출력
		System.out.println("[메서드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("메서드 이름: " + method.getName());            // 메서드 이름 출력
			System.out.print("매개변수 타입: ");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> paramType : parameterTypes) {
				System.out.print(paramType.getName() + " ");                  // 메서드 매개변수 타입 출력
			}
			System.out.println();
			System.out.println("리턴 타입: " + method.getReturnType().getName()); // 리턴 타입 출력
			System.out.println();
		}

		clazz = com.multi.d_api.Car.class;
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();


		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}


}
