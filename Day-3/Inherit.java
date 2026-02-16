public class Inherit {
    public static void main(String[] args) {
        child c=new child();
        c.details();
        c.dsa();
        c.impl();
    }
}
class Parent{
    void details(){
        System.out.println("This is DSA class");
    }
    void dsa(){
        System.out.println("We are learning DSA");
    }
}
class child extends Parent{
    void impl(){
        System.out.println("we are implementing dsa using java");
    }   
}