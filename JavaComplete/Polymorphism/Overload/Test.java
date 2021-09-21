class Test{
    void show(int a){
        System.out.println("one");
    }
    void show(int... b){
           System.out.println("Two");
    }
    public static void main(String[] args){
        Test t= new Test();
        t.show();
    }
}