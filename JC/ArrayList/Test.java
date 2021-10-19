import java.util.*;
class Test{
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("1");
        al.add("Red");
        al.add("Yellow");
        al.add("Blue");
        al.add("1");
        al.add(true);
        System.out.println(al);
        System.out.println(al.get(2));
        
        al.remove(3); // remove
        System.out.println(al.get(2));
        System.out.println(al);
        
        
        
    }
}