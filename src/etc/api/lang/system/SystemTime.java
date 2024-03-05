package etc.api.lang.system;

public class SystemTime {

    private static long start;

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        int total = 0;

        for (int i = 1; i <=2000000000; i++) {
            total += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("실행 소요 시간 " + (end-start) * 0.001 + "초");

        System.out.println(System.getProperties());
        System.out.println(System.getenv());

    }
}
