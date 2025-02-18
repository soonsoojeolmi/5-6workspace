package com.uni.stream.a_basic.intermediate_operations;

import com.uni.stream.a_basic.dto.Member;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class C_Sorted {
	/*
	 * 정렬
	 *   - 스트림은 요소가 최종 처리 되기전에 중간 단계에서 요소를 정렬해서 최종 처리 순서를 변경할 수 있다.
	 *   - Stream<T>은 요소가 객체일경우 Comparable을 구현하지 않을 경우  ClassCastException 예외가 발생한다.
	 *   - IntStream, DoubleStream, LongStream은 요소를 오름차순으로 정렬한다.
	 */
	
	// 요소가 객체일 때
	public void method1() {// MEMBER 참고 compareTo 메소드가 구현되어 있어요
		List<Member> list = Arrays.asList(
			new Member(1, "유재석", 20, "M"),
			new Member(2, "이재욱", 23, "M"),
			new Member(3, "이효리", 18, "F")				
		);
		
		// Comparable 구현 내용에 따라 정렬
		list.stream()
//				.sorted()
//				.sorted((m1, m2) -> m1.compareTo(m2))
				.sorted(Comparator.naturalOrder())
				.forEach(System.out::println);
		
		System.out.println();
		
		// Comparable 구현 내용에 반대로 정렬
		list.stream()
//				.sorted((m1, m2) -> m2.compareTo(m1))
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		
		System.out.println();

		//점수를 기준으로 오른차순으로 정렬한 새 스트림 얻기
		list.stream()
				.sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getAge()));
		System.out.println();

		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		list.stream()
				.sorted((s1, s2) -> Integer.compare(s2.getAge(), s1.getAge()))
				.forEach(s -> System.out.println(s.getName() + ": " + s.getAge()));
	}
	
	// 요소가 기본 자료형일 때
	public void method2() {
		IntStream stream = Arrays.stream(new int[] {5, 2, 4, 3, 1});
		
		stream.sorted().forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		
		// 기본 자료형 내림차순으로 정렬하는 방법
		Arrays.stream(new int[] {5, 2, 4, 3, 1})
				 .boxed() //Integer 타입으로 박싱처리
				 .sorted(Comparator.reverseOrder())
				 .forEach(value -> System.out.print(value + " "));
		
		System.out.println();
	}
}
