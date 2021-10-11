class Account{
    Account(){
        System.out.println("Constructor Execute automatically @ time of object creation");
    }
    public static void main(String args[]){
        System.out.println(new Account());
        System.out.println(new Account());
    }
}

