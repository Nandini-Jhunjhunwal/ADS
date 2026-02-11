public class OverrideMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.details();
    }
}

class Parent {
    void details(){
        System.out.println("This is DSA class");
    }
}

class Child extends Parent {
    @Override
    void details(){
        System.out.println("This is child class");
    }
}