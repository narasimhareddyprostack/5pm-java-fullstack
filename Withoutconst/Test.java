class Test{
    String message;
    public void setMessage(String newMsg){
        message = newMsg;
    }
    public String getMessage(){
        return message;
    }
    public static void main(String[] args){
        Test s =new Test();
        s.setMessage("Hello, Good Morning");
        System.out.println(s.message);
        System.out.println(s.getMessage());
    }
}

