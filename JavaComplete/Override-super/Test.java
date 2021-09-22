class Parent{
    public void show(){
        System.out.println("Parent - Show method");
    }
}
class Child extends Parent{
    public void show(){
        super.show();
        System.out.println("Child - Show method");
    }
}
class Test{
    public static void main(String[] args){
      Child c = new Child();
      c.show();  
    }

}