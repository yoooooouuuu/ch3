package homework11_16;

public class page_17 {
	public static void main(String[] args)	//P17
	{
		Car7 car1 = new Car7();
		car1.setNumGas(1234, 29.3);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+"，汽油量是"+gasoline);
	}
}
class Car7
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
}
