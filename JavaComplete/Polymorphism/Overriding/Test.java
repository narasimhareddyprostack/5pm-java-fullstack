class A{
  Object  show(){
    System.out.println("class A - public show method");
    return null;
  }
}
class B extends A{
  Integer show(){
    System.out.println("class B - public show method");
    return 1;
   } 

}
public class Test{
    public static void main(String[] args){
            B b = new B();
            b.show();
    }
}