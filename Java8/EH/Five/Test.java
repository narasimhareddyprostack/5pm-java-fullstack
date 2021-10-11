class Test{
    public static void main(String[] args){
        Test t = new Test();
        t.calc();
    }
    public void calc(){
        try{ int a = 25, b=0, c;
        c= a/b;
        System.out.println(c);
        System.out.println("Hello");
        }
        catch(ArithmeticException ae){
             ae.printStackTrace();
        }
       
    }
}