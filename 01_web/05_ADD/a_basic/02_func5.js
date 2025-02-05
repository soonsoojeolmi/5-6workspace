/* 01_logical-operator(논리 연산자) 
||(OR), &&(AND), !(NOT) 의 논리 연산자는 피연산자를 논리 연산한다.
*/
/* 01_short-circuit evaluation(단축 평가)
표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평가 과정을 생략하는 것 
*/

console.log("apple" || "banana"); // apple
console.log(false || "banana"); //banana
console.log("apple" || false); //apple

console.log("apple" && "banana"); // apple
console.log(false && "banana"); //banana
console.log("apple" && false); //apple

let num = 1;
if (num % 2 == 0) console.log("짝수입니다. ");
else console.log("홀수입니다. ");

num % 2 == 0 && console.log("짝수입니다");
num % 2 == 0 || console.log("홀수입니다");

//let obj = null;
let obj = { k: "v" };
let val = obj && obj.k;
console.log(val);
