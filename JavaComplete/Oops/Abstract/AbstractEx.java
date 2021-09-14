public class AbstractEx{
    public static void main(String[] args){
        SBI sbi = new SBI();
        sbi.open_Account();
        sbi.cal_Interest();
        sbi.close_Accouont();

        Canara canara =new Canara();
        canara.open_Account();
        canara.close_Accouont();

    }
}
abstract class RBI{
    public void open_Account(){
        System.out.println("Opened Account Successfully");
    }
    public void close_Accouont(){
        System.out.println("Closed Account Successfully");
    }
    public abstract int cal_Interest();
}
class SBI extends RBI{


  public int cal_Interest(){

      System.out.println("SBI Interest Rates are : 7");
    return 7;
  }
}
class Canara extends RBI{
    public int cal_Interest(){
          System.out.println("Canara Interest Rates are : 8");
        return 8;
    }
}