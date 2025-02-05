/* 01_comparison-operator(비교 연산자) 
비교 연산자는 좌항과 우항의 비교 연산자를 비교한 다음 그 결과를 불리언 값으로 반환한다.
if문이나 for문과 같은 제어문의 조건식에서 주로 사용한다.
*/
/* 동등/일치 비교 연산자
동등 비교(loose equality) 연산자와 일치 비교(strict equality) 연산자는 비교하는 엄격성의 정도가 다르다. 
동등 비교(==, !=) 연산자는 먼저 암묵적 타입 변환을 통해 타입을 일치시킨 후 같은 값인지 비교한다.
일치 비교(===, !==) 연산자는 타입과 값이 모두 일치하는지 비교한다.
*/

// 숫자 1, 문자 1  true 비교
console.log(`1 == 1 : ${1 == "1"}`);
console.log(`1 === '1' : ${1 === "1"}`);
console.log(`1 == true: ${1 == true}`);
console.log(`1 === true : ${1 === true}`);

console.log(`null == undefined : ${null == undefined}`);
console.log(`null === undefined : ${null === undefined}`);

console.log(`NaN == NaN : ${NaN == NaN}`);
//NaN 자기 자신과 일치하지 않는

// (base) PS C:\workspace\multi\01_web\05_add\a_basic> node .\01_function.js  실행할떄 node 명령어 한칸띄우고 해당파일명 작성
// hello
// (base) PS C:\workspace\multi\01_web\05_add\a_basic> cd ../      --> 상위 폴더로 올라감
// (base) PS C:\workspace\multi\01_web\05_add> cd ../  --> 상위 폴더로 올라감
// (base) PS C:\workspace\multi\01_web> cd .\05_add\a_basic\  --> 해당 폴더로 이동시 파일명 쓰고 tab 하면 자동생성
// (base) PS C:\workspace\multi\01_web\05_add\a_basic>
