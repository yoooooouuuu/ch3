package homework11_16;

public class page_15 {
	public static void main(String[] args)	//P15
	{
		Car6 car1 = new Car6();
	
		int number = 1234;
		double gasoline = 29.4;
		
		car1.setNumGas(number, gasoline);
	}
}
class Car6
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
