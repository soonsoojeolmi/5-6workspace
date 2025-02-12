package com.multi.a_array;

import java.util.Arrays;
import java.util.List;

public class Exec04 {
    public static void main(String[] args) {
        // 6.1. Arrays.toString()
        // 배열을 문자열로 변환하여 출력
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("6.1. Arrays.toString() -> " + Arrays.toString(numbers));

        // 6.2. Arrays.sort()
        // 배열을 오름차순으로 정렬
        int[] unsortedNumbers = {5, 3, 1, 4, 2};
        Arrays.sort(unsortedNumbers);
        System.out.println("6.2. Arrays.sort() -> " + Arrays.toString(unsortedNumbers));

        // 6.3. Arrays.equals()
        // 두 배열의 요소가 동일한지 비교하여 결과를 반환
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};
        System.out.println("6.3. Arrays.equals(arr1, arr2) -> " + Arrays.equals(arr1, arr2)); // true
        System.out.println("6.3. Arrays.equals(arr1, arr3) -> " + Arrays.equals(arr1, arr3)); // false

        // 6.4. Arrays.fill()
        // 배열의 모든 요소를 지정한 값으로 채움
        int[] filledNumbers = new int[5];
        Arrays.fill(filledNumbers, 9);
        System.out.println("6.4. Arrays.fill() -> " + Arrays.toString(filledNumbers));

        // 6.5. Arrays.copyOf()
        // 배열의 요소를 복사하여 새 배열을 생성, 지정한 길이만큼 복사
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println("6.5. Arrays.copyOf() -> " + Arrays.toString(copy));

        // 6.6. Arrays.asList()
        // 배열을 리스트로 변환
        String[] fruits = {"apple", "banana", "cherry"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println("6.6. Arrays.asList() -> " + fruitList);

        // 6.7. Arrays.deepToString()
        // 다차원 배열을 문자열로 변환하여 출력
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("6.7. Arrays.deepToString() -> " + Arrays.deepToString(matrix));

        // 6.8. Arrays.copyOfRange()
        // 배열의 특정 범위를 복사하여 새 배열 생성 (끝 인덱스는 포함하지 않음)
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);  // 인덱스 1부터 3까지 복사
        System.out.println("6.8. Arrays.copyOfRange() -> " + Arrays.toString(rangeCopy));
    }
}
