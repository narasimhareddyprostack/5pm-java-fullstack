public class Test{    
    public static void main(String args[]){  
    String s=new String("ProStack");
    System.out.println(s.charAt(0));//P
    System.out.println(s.charAt(1));//r
    System.out.println(s.charAt(4));//t
    System.out.println(s.charAt(99));//java.lang.StringIndexOutOfBoundsException: 
                                     //String index out of range
    }
}    