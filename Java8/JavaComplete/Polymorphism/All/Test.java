class A{
private void show(){
    System.out.println("A - show()");
}
}
class B extends A{
void show1(){
    System.out.println("B - show()");
}
}

public class Test{
public static void main(String[] args){
    B a = new B();
    a.show();
    a.show1();
}
}