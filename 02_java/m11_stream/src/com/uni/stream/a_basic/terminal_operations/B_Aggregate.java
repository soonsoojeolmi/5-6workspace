package com.uni.stream.a_basic.terminal_operations;


import java.util.*;

public class B_Aggregate {
	/*
	 *  집계 (Aggregate)
	 *   - 최종 처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 것을 말한다.
	 *     대량의 데이터를 가공해서 축소하는 리덕션(Reduction) 이라고 함
	 *     집계 메서드에서는 리턴 값으로 OptionalXXX클래스를 리턴한다.
	 *     OptionalXXX는 자바8 java.util 패키지의 Optional, OptionalDouble, OptionalInt, OptionalLong 클래스타입을 말한다.
	 *      (value-based class)이 객체에서 값을 얻기 위해서는 get(), getAsDouble(), getAsInt(), getAsLong()을 호출하면 된다.

	 *   - count()
	 *     - 요소의 개수를 리턴
	 *   - findFirst()
	 *     - 첫 번째 요소를 리턴
	 *   - max()
	 *     - 최대 요소를 리턴한다.
	 *   - min()
	 *     - 최소 요소를 리턴한다.
	 *   - average()
	 *     - 요소들의 평균을 리턴한다.
	 *   - sum()
	 *     - 요소들의 총합을 리턴한다.
	 *
	 * 커스텀 집계
	 *   - 스트림에서 기본 집계 메소드를 제공하지만 다양한 집계 결과물을 만들 수 있도록 reduce() 메소드를 제공한다.
	 *     (매개 타입으로 XXXOperator, 리턴 타입으로 OptionalXXX)
	 *

	 *
	 */

	public void method1() {
		int[] array = {1, 2, 3, 4, 5, 6};

		long count = Arrays.stream(array).filter(i -> i % 2 == 0).count();

		System.out.println("2의 배수의 개수 : " + count);

		int sum = Arrays.stream(array).filter(i -> i % 2 == 0).sum();

		System.out.println("2의 배수의 합 : " + sum);

		OptionalDouble average = Arrays.stream(array).filter(i -> i % 2 == 0).average();

		System.out.println("2의 배수의 평균 : " + average.getAsDouble());

		OptionalInt max = Arrays.stream(array).filter(i -> i % 2 == 0).max();

		System.out.println("2의 배수의 최대값: " + max.getAsInt());

		OptionalInt min = Arrays.stream(array).filter(i -> i % 2 == 0).min();

		System.out.println("2의 배수의 최소값: " + min.getAsInt());

		OptionalInt findFirst = Arrays.stream(array).filter(i -> i % 2 == 0).findFirst();

		System.out.println("2의 배수의 첫 번째 요소: " + findFirst.getAsInt());

		System.out.println();
	}


	public void method2() {
		/*
		 * Optional 클래스
		 *   - 스트림의 최종 결과 값을 저장하는 객체이다.
		 *   - 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있는 객체이다.
		 *   - get() : 저장되어있는 값을 얻기 위해 사용한다.
		 *   - isPresent() : 값이 저장되어 있는지 여부를 검사한다.
		 *   - orElse() : get()과 동일하게 저장되어있는 값을 얻어오는 메소드로 값이 저장되어있지 않을 경우 디폴드 값을 지정한다.
		 *   - ifPresent(Consumer) : 값이 저장되어 있을 경우 Consumer에서 값을 처리한다.
		 */
		List<Integer> list = new ArrayList<>();

		//주석풀고해보기
		list.add(1);
		list.add(4);


		// 빈 값 처리 방법 1 (값의 존재 여부 확인)
		OptionalDouble optional = list.stream().mapToInt(i -> i).average();

		if(optional.isPresent()) {
			System.out.println("평균 : " + optional.getAsDouble());
		} else {
			System.out.println("데이터가 없음");
		}

		// 빈 값 처리 방법 2 (디폴트 값을 설정)
		double avg = list.stream()
							.mapToInt(i -> i)
							.average() //IntStream 에 average()
							.orElse(0.0);

		System.out.println("평균 : " + avg);

		// 빈 값 처리 방법 3 (집계 값을 처리하는 Consumer를 등록)
		list.stream()
				.mapToInt(i -> i)
				.average()
				.ifPresent(d -> System.out.println("평균 : " + d)); //ifPresent(Consumer)
	}


	public void method3() {
		
		
		/* reduce() 
		 * Stream API 에서는 커스텀하기 집계 결과물을 만드는 reduce()라는 메소드를 제공한다.
		 * (sum(), average(), count(), max(), min() 말고도 커스텀하게 사용할 경우 사용)
		   Stream, IntStream, LongStream, DoubleStream 각 인터페이스에는 reduce() 메소드가 오버로딩 되어 있다.
		   (매개타입 XXXOperator, 리턴 타입 OptionalXXX, int, long, double)스트림 요소가 전혀 없을 경우
		    디폴트 값인 identity 매개값이 리턴된다.
		    
		    XXXOperator 매개값은 집계 처리를 위한 람다식 을 대입하는 곳
		 */
	//	int[] array = {};  //주석풀어가면서 하기
		int[] array = {1, 2, 3, 4, 5, 6};

		Arrays.stream(array)
				 .reduce((i1, i2) -> i1 * i2)//   // custom한 집계함수 reduce 이용 => stream에 element가 없을시 오류 남
				 .ifPresent(i -> System.out.println("요소들의 곱은 얼마인가요? " + i));

		// reduce를 이용하여 identity(디폴트값 설정) => stream에 element가 없으면 1을 리턴함
		int result = Arrays.stream(array)
				 				.reduce(1, (i1, i2) -> i1 * i2);

		System.out.println(result);
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

