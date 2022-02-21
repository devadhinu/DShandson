package Testpractice.Testpractice;

class Employee{
	
	private String name;
	private double salary;
	
	Employee(String n,double s){
		name=n;
		salary=s;
	}
	
	 public String getName() 
	 {
		return name;
	
	 }
	public double getSalary() 
	 {
		return salary;
		
	 }
	 
	 public void setName(String n) 
	 {
		 name=n;
		
	 }
	 public void setSalary(double s) 
	 {
		 salary=s;
		
	 }
	 
	 public void raisesalary(double percent) {
		
		 salary+=salary*percent/100;
		 
	 
	 }
}
class Manager extends Employee{
    double bonus;
	Manager(String n, double s,double b) 
	{
		super(n, s);
		bonus=b;		
	}
	void setBonus(double b) 
	{
		bonus=b;
	}
	public double getBonus() 
	{
		return bonus;
	}
	public double getSalary() 
	 {
		return super.getSalary()+bonus;		
	 }
	
}

public class InheritanceDemo {
	
	public static void main(String args[]) {
		
		Employee e1= new Employee("Dinesh", 1000000);
		e1.raisesalary(30);	
		System.out.println(e1.getSalary());	
		
		Manager m1= new Manager("Babu", 80000.0, 0.0);
		m1.setBonus(100);
		System.out.println(m1.getBonus());	
		
		System.out.println(m1.getSalary());	
		
		//Can create a object for employee from Manager 
		
		Employee e2= new Manager("Devasena", 300000, 50000);
		Employee[] emp = new Employee[4];
		emp[0] =new Employee("Devi",30000);
		emp[1] =new Employee("Sudha",30000);
		emp[2] =new Employee("Karan",30000);
		emp[3] =m1;
		
		for(Employee eachemp : emp)
		{
			System.out.println(eachemp.getName());
		}
		
		
		
		
	}	
	


}
