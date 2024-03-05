package etc.exception.throw_;

public class ThrowExample {
    
    static int calcTotal(int num) throws Exception {

        if(num <= 0) {
            throw new Exception();
        }

        int total = 0;

        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {

        try {
            System.out.println(calcTotal(100));
            System.out.println(calcTotal(-120));
            System.out.println(calcTotal(10));
            System.out.println(calcTotal(-10));
        } catch (Exception e) {
            System.out.println("0보다 큰 값을 주세요");
        }

    }
}
