class Emp{
     int emp_No;
    String emp_Name;
    Emp(int emp_No, String emp_Name){
        this.emp_No = emp_No;
        this.emp_Name =emp_Name;
        System.out.println("Constructor Execture automatically");
    }
    public static void main(String[] args){
    //new Emp(101,"Ravi");
    System.out.println(emp_Name);
    }
}