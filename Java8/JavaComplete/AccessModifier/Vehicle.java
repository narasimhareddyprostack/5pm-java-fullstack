class Vehicle{
    public final void m1(){
        System.out.println("Vehicle");
    }

}
class Bus extends Vehicle{
    public static void main(String[] a){
        m2();
    }

    public static void m2(){
        System.out.println("Bus");
    }
    
}