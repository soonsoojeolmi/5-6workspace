package com.uni.stream.a_basic.terminal_operations;

import com.uni.stream.a_basic.dto.Student;

import java.util.Arrays;
import java.util.List;

public class A_Match {
	//terminal 최종단계
	/*
	 * Predicate<T>- test(T t) - 파라미터 있고 리턴값(boolean) 있는 CASE
	 *   - Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
	 *   - 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역활을 한다.
	 * 
	 */
	/* 
	 * 매칭
	 *   - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 기능
	 *   - allMatch()
	 *     - 모든 요소들이 매개 값으로 주어진 Predicate의 조건을 만족하는지 조사한다. 
	 *   - anyMatch()
	 *     - 최소한 한 개의 요소가 매개 값으로 주어진 Predicate의 조건을 만족하는지 조사한다. 
	 *   - noneMatch()
	 *     - 모든 요소들이 매개 값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다. 
	 * 
	 */
	
	public void method1() {
		int[] array = {2, 4, 6};
		
		boolean result = Arrays.stream(array).allMatch(i -> i % 2 == 0);
		
		System.out.println(result);
		
		result = Arrays.stream(array).anyMatch(i -> i % 3 == 0);
		
		System.out.println(result);
		
		result = Arrays.stream(array).noneMatch(i -> i % 5 == 0);
		
		System.out.println(result);
	}
	
	public void method2() {
		List<Student> list = Arrays.asList(
			new Student("유재석", 28, "M", 80, 70),
			new Student("이재욱", 23, "M", 70, 60),
			new Student("이효리", 17, "F", 100, 100)				
		);
		
		boolean result = list.stream()
							 .filter(student -> student.getAge() >= 20) // 나이가 20이상인 학생
							 .allMatch(student -> student.getGender().equals("M")); // 모든 학생이 남자인지 확인
		
		System.out.println("20살 이상인 학생들은 모두 남자입니까 ? " + result);
		
		result = list.stream()
				 .filter(s -> s.getGender().equals("M"))
				 .anyMatch(s -> ((s.getMath() + s.getEnglish()) / 2) >= 70);
		
		System.out.println("남학생들 중에 평균이 70점 이상인 학생이 한명이라도 존재하나요? " + result);
		
		System.out.println();		
	}
	
	
	
	
	
	
	
	
	
}
