interface A{
public static final int x =10;  // public , final , static
public abstract void m1();
}
class Test implements A{

    //public static final x = 10;
    public static void main(String[] args){
       int x = 99;
        System.out.println(x);
    }

}