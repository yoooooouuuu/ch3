package homework11_16;

public class page_20 {
	public static void main(String[] args)	//P20
	{
		Car8 car1 = new Car8();
		
		car1.num = 1234;
		car1.gas = -10.0;
		car1.show();
	}
}
class Car8
{
	int num;
	double gas;

	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}