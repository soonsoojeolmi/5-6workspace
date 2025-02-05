/* 04_example */

// 1. 특정 단어로 시작하는지 검사하는 경우
const url = 'https://www.google.com';
// const url = 'http://www.google.com';
// const url = 'www.google.com';
// http:// 또는 https:// 로 시작하는지 검사
console.log(/^https?:\/\//.test(url));

// 2. 특정 단어로 끝나는지 검사하는 경우
const fileName = 'test.js';
// const fileName = 'test.css';
console.log(/js$/.test(fileName));

// 3. 숫자로만 이루어진 문자열인지 검사
const target = '12345';
// const target = '12345@';
// 처음과 끝이 숫자이고 최소 한 번 이상 반복 되는 문자열과 매칭
console.log(/^\d+$/.test(target));

// 4. 아이디로 사용 가능한지 검사
const id = 'hello123';
// const id = 'hello';
// const id = 'hello안녕';
// 알파벳 대소문자 또는 숫자로 시작하고 끝나며 6~12자리인지 검사
console.log(/^[A-Za-z0-9]{6,12}$/.test(id));

// 5. 핸드폰 번호 형식에 맞는지 검사
const phone = '010-1234-5678';
// const phone = '010-123-4567';
// const phone = '010-123-456';
console.log(/^\d{3}-\d{3,4}-\d{4}$/.test(phone));

// 6. 특수 문자 포함 여부 검사
const target2 = 'hello#world';
// const target2 = 'helloworld';
console.log(/[^A-Za-z0-9]/gi.test(target2));

