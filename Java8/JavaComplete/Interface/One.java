class One{
 int x = 10;
 static int y=100;
 public static void main(String[] a){
     int z=200;
     System.out.println(y);
    One b = new One();
    b.m1();
 }
 public void m1(){
     System.out.println(x);
 }
}