package Employee;

public class TestEmployee implements EmployeeInterface
{
	int a,b;
	
	TestEmployee()
	{
		a=10;
		b=20;
	}

	public void employee_name()
	{
		System.out.println("Employee_name is SCB");
	}
	public void multiplication() 
	{		
		int total;
		total =  a*b;
		System.out.println("multiplication of a & b is"+total);
	}

	public void Addition() 
	{
		int sum=a+b;
		System.out.println("Addition of a & b is"+sum);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
    TestEmployee x=new TestEmployee();
    x.employee_name();
    x.employeeID();
    x.employeedesg();
    x.employeesal();
    x.multiplication();
    x.Addition();
    
    
    ///EmployeeClass2 N=new EmployeeClass2();
    //N.multiplication();
	}

	
	
	@Override
	public void employeeID() {
		// TODO Auto-generated method stub
		System.out.println("3096");
	}

	@Override
	public void employeedesg() {
		// TODO Auto-generated method stub
		System.out.println("SE");
		
	}

	@Override
	public void employeesal() {
		// TODO Auto-generated method stub
		System.out.println("10k");
	}
	
	
	
	
}

   