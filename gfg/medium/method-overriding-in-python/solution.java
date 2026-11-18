class Employee {
   // Code Here
   int id;
   int salary;
   
   public Employee(int id,int salary){
       this.id=id;
       this.salary=salary;
   }
   
   public String getInfo(){
    return "EmployeeID:" + id + " Salary:" + salary;   
   }
   
}

class SalesEmployee extends Employee {
   // Code Here
   int sales=0;
    
   public SalesEmployee(int id,int salary){
      super(id,salary);
   }
   
    public SalesEmployee(int id, int salary, int sales){
      super(id,salary);
       this.sales=sales;
   }
   
   
   public String getInfo(){
       return super.getInfo()+ " Sales:" + sales;
   }
}