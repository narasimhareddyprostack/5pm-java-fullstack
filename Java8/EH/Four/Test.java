class MarriageException extends Exception{
    MarriageException(String message){
        super(message);
    }
}
class Test{
    public static void main(String[] args){
    try{
            int age = 30;
            if(age<25){
                throw new MarriageException("Not Eligible for Marriage");
            }
            else{
            System.out.println("Eligible Marrige");

            }
    }
    catch(MarriageException me){
       /*  System.out.println(me);
        System.out.println(me.getMessage());
        System.out.println(me.getClass()); */
        me.printStackTrace();
    }
 }
}