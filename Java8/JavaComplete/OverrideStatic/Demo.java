class Parent{ 
 public static void  show(){
        System.out.println("Class Parent - show Method");
        }
}
class Child extends Parent{
 public static void  show(){
        System.out.println("Class Child - show Method");
    } 
}
class Demo{
    public static void main(String[] args){

        Parent a=new Parent();
        a.show();
        Child b = new Child();
        b.show();
        Parent a1= new Child();
        a1.show();
    }
}