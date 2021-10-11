class Demo{
    public static void main(String[] args){
        System.out.println("First main method");
        Demo d = new Demo();
        d.main(10);
    }
     public static void main(int a){
        System.out.println(" overloaded main method");
    }
}