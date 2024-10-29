import java.util.*;
class Employee{
    private int employeeid;
    private String name;
    private String branch;
    private double rating;  
    private boolean transport;
    public Employee(int employeeid,String name, String branch,double rating,boolean transport){
        this.employeeid =employeeid;
        this.branch=branch;
        this.name=name;
        this.transport=transport;
        this.rating=rating;
    }
    public void setemployeeid(int employeeid){
        this.employeeid=employeeid;

    }
    public int  getemployeeid(){
        return this.employeeid;
    }
    public void  setname(String name){
        this.name=name;
    }
    public String getname(){
        return  this.name;
    }
    public void setrating(double rating){
        this.rating=rating;
    }
    public double getrating(){
        return this.rating;
    }
    public void setbranch(String branch){
        this.branch=this.name;
    }
    public String getbranch(){
        return this.branch;
    }
    public void settransport(boolean transport){
        this.transport=transport;
    }
    public boolean  gettransport(){
        return this.transport;
    }
   
}

public class Ipa2 {
    public static Employee findEmployeeWithSecondHighestRating(Employee[] employee){
        Employee secondhighest=null;
        Employee firsthighest=null;
        for (Employee e: employee){
            if(!e.gettransport()){
                if(firsthighest==null|| e.getrating()>firsthighest.getrating()){
                    secondhighest=firsthighest;
                    firsthighest=e;
                }
                else if(secondhighest==null|| e.getrating()>secondhighest.getrating()){
                           secondhighest=e;
                }
            }
        }
        return secondhighest;
    }
    public static  int findCountOfEmployeesUsingCompTransport(Employee[] employee, String branchname){
        int count=0;
        for (Employee e:employee){
           
            if(e.gettransport()==true && (e.getbranch().equals(branchname))){
                   count++;
            }
        }
        return count;
    }
    public static void  main(String[] args){
       Employee[] employee= new Employee[4];
       Scanner scan = new Scanner(System.in);
       for(int i=0; i< employee.length;i++){
        System.out.println("enter id");
          int employeeid = scan.nextInt(); scan.nextLine();
          System.out.println("name");
        String name= scan.nextLine();
        System.out.println("branch");
        String branch =scan.nextLine();
        System.out.println("rating");
        double rating = scan.nextDouble();scan.nextLine();
        System.out.println("trasport");
        boolean transport =scan.nextBoolean();scan.nextLine();
          employee[i]=new Employee(employeeid, name, branch, rating, transport);
    }
    System.out.println("enter branch name ");
    String branchname= scan.nextLine();
    int employee_count =findCountOfEmployeesUsingCompTransport(employee,branchname);
    if(employee_count>0){
        System.out.println(employee_count);
    }
    else{
        System.out.println("No such Employees");
    }
   Employee secondd=  findEmployeeWithSecondHighestRating(employee);
   if(secondd==null){
    System.out.println("All Employees using company transport");
   }
   else{
     System.out.println(secondd.getemployeeid());
     System.out.println(secondd.getname());
   }
}
}
