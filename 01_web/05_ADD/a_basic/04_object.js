/* 01_Object-constructor-function (Object 생성자 함수)
new 연산자와 함께 Object 생성자 함수를 호출하면 빈 객체를 생성하여 반환한다.
빈 객체 생성 이후 프로퍼티 또는 메서드를 추가하여 객체를 완성할 수 있다. 
*/

const student = new Object();

student.name = "제니";
student.age = 16;

console.log(student);

/* 반드시 Object 생성자 함수를 사용해 객체를 생성할 필요는 없다. 객체 리터럴을 사용하는 것이 더 간편하다.
자바스크립트에는 Object 생성자 함수 이외에도 String, Number, Boolean, Function, Array, Date, RegExp
 등의  생성자 함수를 제공한다. */
