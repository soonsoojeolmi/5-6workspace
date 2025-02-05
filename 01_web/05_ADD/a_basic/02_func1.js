/*
템플릿 리터럴
ES6부터 도입 된 멀티라인 문자열, 표현식 삽입 등의 편리한 문자열 처리 기능을 제공하는 문자열 표기법이다.
이 때는 작은 따옴표, 큰 따옴표 대신 백틱을 사용해 표현한다.
*/

const lastName = "홍";
const firstname = "길동";

console.log(`제 이름은 ${lastName}${firstname} 입니다.`);

//함수 선언문
// 함수 선언문은 런타임 이전 자바스크립트 엔진에 의해 먼저 실행 된다.
// 따라서 함수 선언문 이전에 함수를 참조할 수 있으며 호출할 수도 있다.
// 함수 선언문이 코드의 선두로 끌어 올려진 것처럼 동작하는 자바스크립트 고유의 특징을 함수 호이스팅이라고 한다.

console.log(hello);

function hello(name) {
  return `${name} 님 안녕하세요`;
}

console.log(hello(`제니`));

//함수 표현식

// 자바스크립트에서 값의 성질을 가지고 있는것을 일급 객체
// 일급객체 이기 때문에 함수객체를 변수 에 할당 할수있다.

//hello2식별자, hello이름
let hello2 = function hello1(name) {
  return `${name} 님 안녕하세요`;
};

console.log(hello2(`제니`));

let hello3 = function hello1(name) {
  return `${name} 님 안녕하세요`;
};

console.log(hello3(`제니`));

//함수선언문은 함수만 정의된것, 함수의 이름을 생략 할수 없는데
//함수표현식은  함수를 변수에 담고 , 함수이름을 생략할수있다.
//함수호출은 식별자로 이루어지지고 함수 명으로 호출은 불가능 하다.
