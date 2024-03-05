package etc.api.lang.obj.stringbuilder;

public class StrBuilderExample {
    public static void main(String[] args) {

        String str = "hello";
        System.out.println("str의 주소값 : " + str.hashCode());

        str = "hello world";
        System.out.println("str의 주소값" + str.hashCode());

        str = "hello";
        System.out.println("str의 주소값" + str.hashCode());

        System.out.println("---------------------------");

        StringBuilder sb = new StringBuilder("hello");

        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode());

        sb.insert(6, "my");
        System.out.println(sb);
        
        sb.replace(6, 8, "your");
        System.out.println(sb);
        
        sb.delete(6, 11);
        System.out.println(sb);

        int idx = sb.indexOf("h");
        System.out.println("idx = " + idx);

        System.out.println(sb.length());
    }
}
