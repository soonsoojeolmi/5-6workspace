//객체 리터럴에 의한 객체 생성

const student1 = {
  id: 1,
  name: "제니",
  age: 16,
};

const student2 = {
  id: 2,
  name: "로제",
  age: 17,
};

console.log(student1);
console.log(student2);

function Student(name, age) {
  this.name = name;
  this.age = age;
  this.getInfo = function () {
    return `${this.name}은 나이가 ${this.age}입니다.`;
  };
}

let student3 = new Student("사나", 20);
console.log(student3.name);
console.log(student3.getInfo());

/* 02_instance-creation-process(인스턴스 생성 과정) */
function StudentNew(name, age) {
  // 1. 암묵적으로 인스턴스가 생성되고 this에 바인딩 되는 과정이 런타임 이전에 실행된다.
  console.log(this);
  // 2. this에 바인딩 되어 있는 인스턴스를 초기화 한다.
  this.name = name;
  this.age = age;
  this.getInfo = function () {
    return `${this.name}(은)는 ${this.age}세입니다.`;
  };
  // 3. 완성된 인스턴스가 바인딩 된 this가 암묵적으로 반환된다.
  // 만약 명시적으로 객체를 반환하면 암묵적인 this 반환이 무시된다.
  // return {};
  // 하지만 명시적으로 원시 값을 반환하면 원시 값 반환은 무시되고 암묵적으로 this가 반환된다.
  // return 1;
  // 생성자 내부에서 return은 생략하는 것이 기본이다.
}
// 인스턴스 생성
const student = new StudentNew("홍길동", 20);
console.log(student);

function Dog(name, age) {
  // 이 함수가 new 연산자와 함께 호출되지 않았다면 new.target은 undefined이다.
  console.log(new.target);
  if (!new.target) {
    console.log(`new.target= ${new.target}`);
    // new 연산자와 함께 생성자 함수를 재귀 호출하여 생성 된 인스턴스를 반환한다. [Function: Dog]
    return new Dog(name, age);
  }
  this.name = name;
  this.age = age;
}

const dog = Dog("동이", 20);
console.log(dog);
