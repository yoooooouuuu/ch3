package homework11_16;

public class page_9 {
	public static void main(String[] args)	//P9
	{
		Car2 car1 = new Car2();
		
		car1.num=1234;
		car1.gas=20.55;
	}	
}
class Car2
{
	int num;
	double gas;
	
	void show() 
	{
	System.out.println("車號是"+this.num);
	System.out.println("汽油量是"+this.gas);
	}
}
