package utill;

import java.util.Scanner;

public class Utility {

    static Scanner sc = new Scanner(System.in);
    public static void makeLine() {
        System.out.println("=========================================");
    }

    //문자열을 입력 받는 기능
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
