package com.multi.c_add;

public class Employee {

    // 인스턴스 변수 (객체마다 개별적으로 가짐)
    private String id;
    private String pwd;
    private String name;
    private int age;  // 나이
    private double salary;  // 급여
    private char gender;    // 성별 ('M' 또는 'F')
    private String email;

    // static 변수 (모든 객체가 공유)
    private static int count;  // 총 회원 수
    private static double sumSalary;  // 총 급여 합계

    //기본 생성자가 꼭 있어야 함
    public Employee(){

        count ++;

    }

    //매개변수 없는 생성자
    public Employee(String id, String pwd, String name, int age, double salary, char gender, String email) {
        this.setId(id);
        this.setPwd(pwd);
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);

        this.gender = gender;
        this.email = email;

        count++;

    }

    //필요 메소드
    public static int getTotalMembers(){
        return count;
    }

    public static double getAvgSalary(){
        if(count == 0){
            return 0;
        }
        return sumSalary/ count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null && !id.trim().isEmpty()){
            this.id=id;
        }else{
            throw new IllegalArgumentException("필수 값입니다.");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd != null && !pwd.trim().isEmpty()){
            this.pwd=pwd;
        }else{
            throw new IllegalArgumentException("필수 값입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name=name;
        }else{
            throw new IllegalArgumentException("필수 값입니다.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age=age;
        }else{
            throw new IllegalArgumentException("나이는 0 이상이어야 합니다.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            if(this.salary > 0){
                sumSalary -= this.salary;
            }
            this.salary = salary;
            sumSalary += salary;
        }else{
            throw new IllegalArgumentException("급여는 0 이상이어야 한다.");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public static double getSumSalary() {
        return sumSalary;
    }

    public static void setSumSalary(double sumSalary) {
        Employee.sumSalary = sumSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
