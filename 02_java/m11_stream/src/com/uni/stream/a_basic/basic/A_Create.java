package com.uni.stream.a_basic.basic;

import com.uni.stream.a_basic.dto.Student;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Create {
	/*
	 * 스트림의 종류
	 *   - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스 들이 상속 관계를 이루고 있다.
	 *     (Stream, IntStream, LongStream, DoubleStream)
	 *   - 스트림 생성
	 *   - 컬렉션으로 부터 스트림 얻기
	 *   - 컬렉션의 stream() 메소드로부터 얻어올 수 있다. (java.util.Collection.stream())
	 *   - 배열로 부터 스트림 얻기
	 *       - Arrays.stream(배열) 메소드를 통해서 얻어오거나 각 스트림의(Stream, IntStream, ...) of() 메소드를 통해서 얻어 올 수 있다.
	 *   - 숫자 범위로 부터 스트림 얻기
	 *       - IntStream의 range(), rangeClosed() 메소드를 이용해서 
	 *         첫 번째 매개 값 부터 두 번째 매개 값까지 혹은 이전까지 제공하는 스트림을 얻어 올 수 있다.    
	 * 
	 */
	
	// 컬렉션으로 부터 스트림 얻기
	public void method1() {
		
		/*
		 *  Arrays.asList를 이용하면 고정된 사이즈의 리스트로 반환 -> 추가,삭제 불가
			new ArrayList<>() 로 새로운 리스트를 생성하면 추가, 삭제 가능
			asList는 generic 메서드이기 때문에 reference type 만을 인자로 받는다
			
			Returns a fixed-size list backed by the specified array.
			특정배열의 size가 변하면 안 되거나 변할 필요가 없을 때 Arrays.asList() 사용
		*/
		List<Student> list = Arrays.asList(
			new Student("유재석", 20, "M", 80, 50),
			new Student("이재욱", 20, "M", 70, 60),
			new Student("이효리", 20, "F", 100, 100)				
		);
		
		// for문 사용
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println();
		/* 메소드 참조(method reference)는 람다 표현식이 단 하나의 메소드만을 호출하는 경우에 해당 람다 표현식에서 불필요한 매개변수를 제거하고 사용할 수 있게 해준다.
		 *  메소드를 호출(실행)하는 것이 아니라 참조만 하기 때문에, 이름 뒤에 소괄호는 쓰지 않는다
		 *  클래스이름::메소드이름
		 *  매개변수를 제거하고 다음과 같이 '::' 기호를 사용하여 표현
		 *  */
		// Stream 사용
		Stream<Student> listStream = list.stream();// 이렇게  한번 사용하면 재사용이 불가능 하므로 주석처리 하고 테스트 하세요 //java.lang.IllegalStateException: stream has already been operated upon or closed
		//listStream.forEach(System.out::println); // 메소드 참조 - 매개변수를 적지않았는데 요소 출력
		list.forEach(s -> System.out.println(s));//- 컬렉션의 stream() 메소드로부터 얻어올 수 있다.
		
		System.out.println();
	}
	
	// 배열로 부터 스트림 얻기
	public void method2() {
		String[] names = {"유재석", "이재욱", "이효리"};
		
		Stream<String> stream = Arrays.stream(names);//Arrays.stream(배열) 메소드를 통해서 얻어오기
		
		stream.forEach(System.out::println);
		
		System.out.println();
	}
	
	// 숫자 범위로 부터 스트림 얻기
	public void method3() {
		IntStream stream = IntStream.range(1, 10); // 첫 번째 매개 값 ~ 두 번째 매개 값 이전까지 값을 요소로 갖는 스트림을 생성한다.
	
		stream.forEach(System.out::print);


		System.out.println();		
		
		stream = IntStream.rangeClosed(1, 10); // 첫 번째 매개 값 ~ 두 번째 매개 값까지 값을 요소로 갖는 스트림을 생성한다.
		
		stream.forEach(System.out::print);

		
		System.out.println();
	}



}
