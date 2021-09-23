class P{
    public void show(){
        System.out.println("Parent Class Show method");
    }
}
class C extends P{
    public void show(){
    System.out.println("Child Class Show method");
    }
}
class Demo{
    public static void main(String[] args){
    P p1 = new C();
    p1.show();
        }
}