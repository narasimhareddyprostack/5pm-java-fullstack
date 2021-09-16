class Emp{
    int emp_No;
    String emp_Name;
    double salary;
 public void get_Emp_Details(){
     System.out.println("Emp Details Methods");

 }
 Emp(int e, String n, double s){
     emp_No = e;
     emp_Name = n;
     salary=s;
     System.out.println(emp_No + "" + emp_Name );
 }
 public static void main(String[] args){

     Emp pavan = new Emp(101, "pavan", 45000);
     Emp kiran = new Emp(102, "Kiran", 55555);
     
    
     
 } 
}