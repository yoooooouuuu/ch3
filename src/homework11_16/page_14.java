package homework11_16;

public class page_14 {
	public static void main(String[] args)	//P14
	{
		Car5 car1 = new Car5();
	
		car1.setNum(1234);
		car1.setGas(20.6);
	}
}
class Car5
{
	int num;
	double gas;
	
	void setNum(int n) 
	{
	num = n;
	System.out.println("將車號設為"+num);
	}
	
	void setGas(double g) 
	{
	gas = g;
	System.out.println("將汽油量設為"+gas);
	}
}