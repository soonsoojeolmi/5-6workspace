package com.uni.stream.a_basic.intermediate_operations;

import com.uni.stream.a_basic.dto.Student;

import java.util.Arrays;
import java.util.List;

public class B_Mapping {
	/*
	 * 매핑 - 변환(map())
	 *   - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업
	 *   
	 *   
	 *   - flatMapXXX()
	 *     - 하나의 요소를 복수 개의 요소들로 구성된 새로운 스트림을 생성한다.
	 *   - mapXXX()
	 *     - 요소를 대체하는 요소로 구성된 새로운 스트림을 생성한다.
	 *   - asDoubleStream()   
	 *     - IntStream, LongStream -> DoubleStream으로 변환해서 리턴한다.
	 *   - asLongStream()
	 *     - IntStream, DoubleStream -> LongStream으로 변환해서 리턴한다.
	 *   - boxed()
	 *     -  primitive 타입을 wrapper 타입으로 박싱하여 반환 , int, long, double 요소를 Integer, Long, Double 요소로 박싱해서 스트림을 생성한다.
	 *     
	 */
	
	// flatMapXXX()
	public void method1() {
		List<String> list = Arrays.asList("Java8 Lambda", "StreamAPI Filtering Mapping");
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		list.stream()
				.flatMap(str -> Arrays.stream(str.split(" ")))//새로운스트림생성
				.forEach(System.out::println);
		
		System.out.println();
	}
	
	// mapXXX()
	public void method2() {
		List<Student> list = Arrays.asList(
			new Student("유재석", 20, "M", 80, 50),
			new Student("로운", 21, "M", 70, 60),
			new Student("이효리", 22, "F", 100, 100)				
		);

		list.stream()
				.map(Student::getName)
				.forEach(name -> System.out.println(name));
		
		System.out.println();

		double avg = list.stream()
				.mapToInt(student -> student.getMath())
				.average()  // OptionalDouble을 반환
				.orElse(0.0);  // 값이 없을 경우 기본값 0.0 반환
		
		System.out.println("수학점수의 평균 : " + avg);
		System.out.println();
	}
	
	// asDoubleStream(), boxed()
	public void method3() {
		int[] array = {1, 2, 3, 4, 5};
		
		Arrays.stream(array)
				 .asDoubleStream()
				 .forEach(value -> System.out.print( value + " "));
		
		System.out.println();
		
		Arrays.stream(array)
				 .boxed()
				 .forEach(value -> System.out.print(value + " "));
		
		System.out.println();
	}
}
