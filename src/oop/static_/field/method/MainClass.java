package oop.static_.field.method;

import jdk.jshell.execution.Util;
import utill.Utility;

import static utill.Utility.input;

public class MainClass {
    public static void main(String[] args) {
        Count c = new Count();
        int result = c.method1();
        int result2 = Count.method2();

//        makeLine();

        String name = input("이름을 입력하세요: ");
        System.out.println("name= " + name);



    }
}
