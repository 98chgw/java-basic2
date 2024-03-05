package etc.api.lang.obj;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [이름: " + name + "나이 : " + age + "]";
    }

    @Override
    public boolean equals(Object obj) {  //Object 타입을 Person 타입으로 형 변화 => name과 age를 확인하기 위해서.
        if (this == obj) return true;  //주소값이 같다면 같은 객체
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (this.name.equals(p.name) && this.age == p.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void personInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
    }


}
