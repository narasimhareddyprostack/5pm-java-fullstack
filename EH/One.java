import java.io.FileInputStream;
class Test{
    public static void main(String[] s){
        try{
        System.out.println("One");
        FileInputStream f = new FileInputStream("E:/Training Batch/FS-9AM-aug-Super/react-16/src/assets/css/super.css");
        }
        catch(Exception e){
              System.out.println("Two");
        }
       
    }
}