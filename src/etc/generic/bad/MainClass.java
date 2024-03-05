package etc.generic.bad;

public class MainClass {
    public static void main(String[] args) {
        Box box = new Box();

        box.setObj(new String("김춘식"));

        System.out.println((String) box.getObj().charAt(0));
    }
}
