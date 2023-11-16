package homework11_16;
public class page_28 {
	public static void main(String[] args)	//P28
	{
		Car13 car1 = new Car13();
		car1.show();
		
		Car13 car2 = new Car13(1234,24.1);
		car2.show();
	}
}
class Car13
{
	private int num;
	private double gas;
	
	public Car13()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car13(int n,double g)
	{
		this();	
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}