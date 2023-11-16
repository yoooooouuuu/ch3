package homework11_16;

public class page_26 {
	public static void main(String[] args)	//P26
	{
		Car11 car1 = new Car11();
		car1.show();
	}
}
class Car11
{
	private int num;
	private double gas;

	public Car11()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}

	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}