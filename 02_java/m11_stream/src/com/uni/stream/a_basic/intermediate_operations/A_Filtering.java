package com.uni.stream.a_basic.intermediate_operations;


import com.uni.stream.a_basic.dto.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A_Filtering {
	
	/*
	 * 필터링
	 *   - 필터링은 중간 처리(중간연산) 기능으로 요소를 걸러내는 역활을 한다.조건에 맞는 요소를 추출(filter())
	 *     - distinct() : 중복을 제거하는 메소드,  Stream의 경우는 기본형타입은 value 로 비교 , 객체의 경우는 Object.equals()가 true를 리턴하면 동일한 객체로 판단한다.
	 *     - filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다.
	 *     
	 */
	
	// 중복제거
	public void method1() {
		List<String> names = Arrays.asList("유재석", "이효리", "이재욱", "유재석", "이재욱");

		Stream<String> stream = names.stream();
		
		stream.forEach(System.out::println);
		
// 		이미 최종 처리 메소드까지 호출 된 스트림은 다시 사용할 수 없다. (컬렉션(배열)로 부터 다시 스트림을 얻어와야한다.)
//		stream.distinct().forEach(str -> System.out.println(str)); 
		
		System.out.println();
		
		names.stream().distinct().forEach(System.out::println);
	
		System.out.println();
	}
	
	// 필터링
	public void method2() {
		List<String> names = Arrays.asList("유재석", "이효리", "이재욱", "유재석", "이재욱", "로운", "이효리");
		
		names.stream().filter(name -> name.startsWith("이")).forEach(System.out::println);
		
		System.out.println();
	
		names.stream()
				 .distinct()
				 .filter(name -> name.startsWith("이"))
				 .forEach(System.out::println);
		
		System.out.println();


		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("유재석", 20, "M", 80, 50));
		totalList.add(new Student("이효리", 20, "F", 80, 50));
		totalList.add(new Student("제니", 20, "F", 80, 50));
		totalList.add(new Student("조세호", 20, "M", 80, 50));
		totalList.add(new Student("남주혁", 20, "M", 80, 50));





		//남학생들만 묶어 List 생성
		/*List<Student> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.collect(Collectors.toList());*/
		List<Student> maleList = totalList.stream()
				.filter(s->s.getGender().equals("M"))
				.toList();

		maleList.stream()
				.forEach(s -> System.out.println(s.getName()));

		System.out.println();

		//학생 이름을 키로 Student 객체를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
						Collectors.toMap(
                                Student::getName,  //Student 객체에서 키가 될 부분 리턴
                                Student::getMath   //Student 객체에서 값이 될 부분 리턴
						)
				);

		System.out.println(map);
	}
}
