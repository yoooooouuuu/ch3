
package homework11_16;


public class page_6 {
	public static void main(String[] args)	//P6
	{
		Car0 car1 = new Car0();
		
		car1.num=1234;
		car1.gas=20.55;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}	
	
}

class Car0
{
	int num;
	double gas;
}