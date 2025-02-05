/* 03_nested-function(중첩 함수)
함수 내부에 정의 된 함수를 중첩 함수 또는 내부 함수라고 한다.
중첩 함수를 포함하는 함수는 외부 함수라고 한다.
일반적으로 중첩 함수는 자신을 포함하는 외부 함수를 돕는 헬퍼 함수의 역할을 한다.
*/

function outer() {
  let outerval = "외부함수";

  function inner() {
    let innerval = "내부함수";

    console.log(outerval, innerval); //클로저 - 내부함수가 외부함수의 전역변수에 접근할 수 있는 것
  }
  inner();
}

outer();
