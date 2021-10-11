import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class File{
    public static void main(String[] a) 
    {
      try{
       FileOutputStream fos = new FileOutputStream("e:/abc.txt");
        }
        catch(FileNotFoundException girish)
        {
        }
        catch(Exception fe)
        {
        }
    }
}