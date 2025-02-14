package com.uni.b_collection.a_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exec02 {
	public static void main(String[] args) {

		// List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
		System.out.println("Immutable List 1: " + immutableList1);
		// immutableList1.add("D"); // 예외 발생: UnsupportedOperationException

		// Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		System.out.println("Immutable Set 1: " + immutableSet1);
		// immutableSet1.remove("A"); // 예외 발생: UnsupportedOperationException

		// Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
		);
		System.out.println("Immutable Map 1: " + immutableMap1);
		// immutableMap1.put(4, "D"); // 예외 발생: UnsupportedOperationException

		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		System.out.println("Immutable List 2 (from mutable list): " + immutableList2);
		// immutableList2.add("D"); // 예외 발생: UnsupportedOperationException

		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		System.out.println("Immutable Set 2 (from mutable set): " + immutableSet2);
		// immutableSet2.remove("A"); // 예외 발생: UnsupportedOperationException

		// Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		System.out.println("Immutable Map 2 (from mutable map): " + immutableMap2);
		// immutableMap2.put(4, "D"); // 예외 발생: UnsupportedOperationException

		// 배열로부터 List 불변 컬렉션 생성
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);
		System.out.println("Immutable List 3 (from array): " + immutableList3);
		// immutableList3.add("D"); // 예외 발생: UnsupportedOperationException
	}
}
