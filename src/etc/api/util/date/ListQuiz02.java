package etc.api.util.date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQuiz02 {
    public ListQuiz02() {
        
    }

    public static void main(String[] args) {
        String name;
        int age;

        List<String> user = new ArrayList<>();
        Collections.addAll(user, "라이언","홍길동","춘식이");

        for (int i = 0; i < 2; i++) {
//            if(user[i].con)
        }

        /*
         1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
          User클래스의 생성자는 모든 필드값을 받는 생성자 1개.

         2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method)
         3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

         4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
         5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면
               그 객체를 삭제해 주세요. (일반 for문)
         */



    }
}
