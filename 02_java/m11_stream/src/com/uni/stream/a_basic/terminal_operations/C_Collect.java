package com.uni.stream.a_basic.terminal_operations;

import com.uni.stream.a_basic.dto.Member;

import java.util.*;
import java.util.stream.Collectors;

public class C_Collect {
	/*
	 * 수집
	 *   - 스트림 요소들은 필터링 또는 매핑한 후 요소들을 수집하는 최종 처리 메소드인 collect()를 제공한다.
	 *   - collect() 메소드를 사용하면 필요한 요소만 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
	 *
	 */
	 /* toCollection : T를 Supplier가 제공한 Collection에 저장
	 *  toMap : T를 K와 U로 매핑해서 K는 키로, U는 값으로 Map에 저장
	 *  toSet : 데이터를 Set으로 변환해야할 때 사용, List의 중복값을 제거
	 * */
	public void method1( ) {
		List<Member> list = Arrays.asList(
			new Member(1, "유재석", 20, "M"),
			new Member(2, "이재욱", 23, "M"),
			new Member(3, "이효리", 19, "F"),
			new Member(4, "로운", 24, "M"),
			new Member(5, "제니", 17, "F")
		);

		List<Member> maleList = list.stream()
										.filter(member -> member.getGender().equals("M"))
										.toList();

		maleList.forEach(System.out::println);

		System.out.println();

		Set<Member> femaleList = list.stream()
										.filter(member -> member.getGender().equals("F"))
						//				.collect(Collectors.toSet());
										.collect(Collectors.toCollection(() -> new HashSet<>())); // 순서유지됨
						//				.collect(Collectors.toCollection(HashSet::new));// 생성자참조



		femaleList.forEach(System.out::println);

		System.out.println();



		Map<String, List<Member>> map = list.stream()
				.collect(
						Collectors.groupingBy(Member::getGender)
				);

		List<Member> maleList1 = map.get("M");
		maleList1.forEach(s -> System.out.println(s.getName()));
		System.out.println();

		List<Member> femaleList2 = map.get("F");
		femaleList2.forEach(s -> System.out.println(s.getName()));

	}


}
