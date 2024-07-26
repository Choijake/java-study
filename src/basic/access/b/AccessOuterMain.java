package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지의 default필드와 메서드 호출 불가
//        data.defaultField = 1;
//        data.defaultMethod();

        //private
        //data.privateField=2;
        //data.privateMethod();

        //public 메서드 호출 클래스의 모든 필드에 접근 가능하다
        data.innerAccess();
    }
}
