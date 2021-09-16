class Account{
    int acc_No;
    String acc_Name;
    int amount;
    Account(int a, String b, int c){
        this.acc_No = a;
        this.acc_Name =b;
        this.amount=c;
        System.out.println("Constructor Execute automatically @ time of object creation");
    }
    public static void main(String args[]){
       Account a1= new Account(101, "Kiran", 5000);
        System.out.println("Hello, "+ a1.acc_Name + "and Your Account no is"+a1.acc_No + "& your balace is:"+a1.amount ) ;
        
    }
}

