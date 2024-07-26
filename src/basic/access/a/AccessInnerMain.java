package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public
        data.publicField = 1;
        data.publicMethod();

        //default
        data.defaultField = 1;
        data.defaultMethod();

        //private
        //data.privateField=2;
        //data.privateMethod();

        //public 메서드 호출 클래스의 모든 필드에 접근 가능하다
        data.innerAccess();
    }
}
