package mywork;

public class Employedetails {
	private int badgenumber;
    private String empName;
    private int empAge;
    private String emptype;

    
    public int getEmpbadgenumber(){
        return badgenumber;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }
    
    public String getEmptype(){
    	return emptype;
    	
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpbadgenumber(int newValue){
        badgenumber = newValue;
    }
    
    public void setEmptype(String newValue){
    	emptype = newValue;
    	
    }
    public static void main(String args[]){
    	Employedetails obj = new Employedetails();
         obj.setEmpName("Vijay");
         obj.setEmpAge(38);
         obj.setEmpbadgenumber(78859);
         obj.setEmptype("Contract");
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee badgenumber: " + obj.getEmpbadgenumber());
         System.out.println("Employee Age: " + obj.getEmpAge());
         System.out.println("Employe Type:" + obj.getEmptype());
        
    } 
//encapsulisation
}
