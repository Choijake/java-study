package extends1.access.parents;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){

    }

    protected void protectedMethod(){

    }

    void defaultMethod(){

    }

    private void privateMethod(){

    }

    public void printParent(){
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);
    }
}
