class Account{
    Account(int a, String b, int c, String d){
        System.out.println("Constructor Execute automatically @ time of object creation");
    }
    public static void main(String args[]){
        new Account(101, "Kiran", 5000, "kiran@tcs.com");
    }
}

