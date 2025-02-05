// rest parameter ...(세개의 점)로 나머지 요소를 한 번에 가져올 수도 있다.
let [sign1, sign2, ...r] = [
  "양자리",
  "황소자리",
  "쌍둥이자리",
  "게자리",
  "사자자리",
];
console.log(sign1);
console.log(sign2);
console.log(r);

let pants = {
  productName: "배기팬츠",
  color: "검정색",
  price: 30000,
};

let { productName: product } = pants;
console.log(product);

//spread-syntax(스프레드 문법, 전개 문법)
// rest parameter처럼 매개변수 목록을 배열로 가져오는 것과는 반대로 배열을 통째로 매개변수에 넘겨주는 기능이다.
// 하나로 뭉쳐 있는 여러 값들의 집합을 전개해서 개별적인 값들의 목록으로 만든다.
let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];
// 배열 객체 여러 개 전달 가능
console.log(`가장 작은 값 : ${Math.min(...arr1, ...arr2)}`);
// 일반 값과 혼합해서 사용 가능
console.log(`가장 작은 값 : ${Math.min(1, ...arr1, 2, ...arr2, 3)}`);

function merge(msg1, msg2) {
  return msg1 + msg2;
}

console.log(merge("안녕하세요."));
console.log(merge("안녕하세요.", "반갑습니다."));
console.log(merge("안녕하세요.", "반갑습니다.", "제 이름은 홍길동입니다"));

function merge(...args) {
  let message = "";
  for (let arg of args) message += arg;
  return message;
}

let arr = [10, 20, 30];
let arrC = arr;

console.log(arrC);
console.log(arr === arrC);

let obj = { name: "홍길동", age: 20 };
let objCopy = { ...obj };
console.log(obj);
console.log(objCopy);
console.log(obj === objCopy);
