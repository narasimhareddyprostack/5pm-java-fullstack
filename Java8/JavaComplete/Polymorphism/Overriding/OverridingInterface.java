interface S{
public abstract void show();
}
class A implements S{
    public void show(){
        System.out.println("Class A Show method");
    }
}
class B {
    public static void main(String[] args){
    A a = new A();
    a.show();
    }
}
