class Test{
    public void m1(){
        System.out.println("One");
    }
    public void m1(int a){
         System.out.println("Two");
    }
    public static void main(String[] args){
        Test t =new Test();
        t.m1(10);
    }
}
//compiler resolve the method call