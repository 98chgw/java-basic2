package etc.exception.throw_;

public class LoginValidaeException extends Exception{

    //기본 생성자
    public LoginValidaeException() {}

    //커ㅡ텀 에러 메세지 받는 생성자
    public LoginValidaeException(String message) {
        super(message);
    }
}
