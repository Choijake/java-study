package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;


    public void publicMethod(){
        System.out.println(publicField);
    }

    void defaultMethod(){
        System.out.println(defaultField);
    }

    private void privateMethod(){
        System.out.println(privateField);
    }

    public void innerAccess(){
        publicField = 10;
        privateField = 10;
        defaultField = 10;
    }
}
