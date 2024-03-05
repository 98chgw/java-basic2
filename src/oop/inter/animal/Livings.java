package oop.inter.animal;

public abstract class Livings implements Animal {

    /*
    인터페이스만으로는아무것도 할 수 없습니다.
    인터페이스를 구현하는 클래스를 통해 명세된 내용을 구현합니다.

    인터페이스의 구현 키워드는 implements입니다.
    상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스의 이름을 씁니다.

    인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서 오버라이딩을 진행하던지
    abstract를 선언해서 자식에게 구현하도록 해야 합니다.
     */
    String name;
    int age;
}
