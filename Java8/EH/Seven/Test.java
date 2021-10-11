import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Test{
public static void main(String[] args){
    File t = new File();
    try{
        t.readData();
    }
    catch(Exception e){
    }
    t.readData();
    
    }
}

class File{
    public void readData() throws Exception {
        FileInputStream fs = new FileInputStream("e:/abc.txt");
        /* try{ 
        FileInputStream fs = new FileInputStream("e:/abc.txt");
        }
        catch(Exception e)
        {
        } */

    
    }
    public void saveData(){

    }
}