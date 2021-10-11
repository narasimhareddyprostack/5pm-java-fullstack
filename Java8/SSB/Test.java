class Test{
    public static void  main(String[] a){
        StringBuffer s1 =new StringBuffer("Kiran");
        StringBuffer s2 =new StringBuffer("Kiran");
   
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        // == operator - ref/address comparision
        //equals() - object class method - is for object comparision.
    }
}