import java.util.LinkedList;
import java.util.List;
import java.util.*;
class LLDemo{
    public static void main(String[] args){
        LinkedList ll  = new LinkedList();
        //List ll  = new LinkedList();
        
        //LinkedList<String> ll  = new LinkedList<String>(); */
        //LinkedList<Integer> ll  = new LinkedList<Integer>();
       
        ll.add("Red");
        ll.add("Blue");
        ll.add(30);
        ll.add(true);
        System.out.println(ll);
        
        ll.addFirst("Green");
        System.out.println(ll);
        
        
        
    
    }
}

/*
for(  Object obj:ll){
                System.out.println(obj);
        }
        //List interface - iterator method
         Iterator a=ll.iterator();
         while(a.hasNext()){
             System.out.println(a.next());
         }
*/