abstract class Test{
	public abstract int m1();	
}
class Super extends Test{
	public int m1(){
	return 100;
	}
	
	public static void main(String[] a){
	System.out.println(m1());
	}
}


