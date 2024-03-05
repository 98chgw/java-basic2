package etc.api.util.date;

import utill.Utility;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        Utility.makeLine();

        //현재 날짜 정보 얻기 (연, 월, 일)
//        LocalDate now = LocalDate.new();
//        System.out.println(now);

        // 지금으로부터 9개월 23일 전

//        LocalDateTime d4 = localDateTime
//                .minusMonths(9)
//                .minusDays(23);
//        System.out.println("d4 = " + d4);
    }
}
